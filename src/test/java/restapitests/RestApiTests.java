package restapitests;

import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestApiTests {

    @Before
    public void setUp() {
        baseURI = "https://api-flask-baur.herokuapp.com";
        port = 443;
        basePath = "/api/v1/quotes";
    }

    @Test
    public void testResponseQuote1() {
        given().
                when().
                get("/{id}", 1).
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON).
                and().
                header("Content-Length", equalTo("107"));
    }

    @Test
    public void testResponseRandomQuote() {
        given().
                when().
                get().
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON);
    }

    @Test
    public void testResponseQuote9999NotFound() {
        given().
                when().
                get("/{id}", 9999).
                then().
                assertThat().
                statusCode(404).
                and().
                contentType(ContentType.JSON);
    }

    @Test
    public void testResponseQuote9() {
        given().
                when().
                get("/{id}", 9).
                then().
                assertThat().
                body("quote_id", equalTo(9)).
                and().
                body("author", equalTo("Mahatma Gandhi")).
                and().
                body("quote", equalTo("Be the change that you wish to see in the world."));
    }

    @Test
    public void testResponseUnableToCreateQuote11() {
        given().
                param("quote_id", 11).
                param("author", "Anonymous").
                param("quote", "Dummy quote.").
                when().
                post("/{id}", 11).
                then().
                assertThat().
                statusCode(400);
    }

    @Test
    public void testResponseEditQuote7() {
        given().
                param("quote_id", 7).
                param("author", "Anonymous").
                param("quote", "There are no words.").
                when().
                put("/{id}", 7).
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void testResponseCreateQuote100() {
        given().
                param("quote_id", 100).
                param("author", "Friedrich Nietzsche, Twilight of the Idols").
                param("quote", "Without music, life would be a mistake.").
                when().
                post("/{id}", 100).
                then().
                assertThat().
                statusCode(201);
    }

    @Test
    public void testResponseDeleteQuote100() {
        given().
                when().
                delete("/{id}", 100).
                then().
                assertThat().
                statusCode(200);
    }
}
