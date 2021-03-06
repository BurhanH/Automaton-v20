# Automaton-v20
Automation testing framework (API) - an example. Based on Java, REST assured, JUnit

[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BurhanH/automaton-v20/blob/master/LICENSE)
![Java CI with Maven](https://github.com/BurhanH/Automaton-v20/workflows/Java%20CI%20with%20Maven/badge.svg?branch=master)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/f0008f8bec6048a6a3ca0859d22d810b)](https://www.codacy.com/manual/BurhanH/Automaton-v20?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BurhanH/Automaton-v20&amp;utm_campaign=Badge_Grade)

## Requirements
JDK 11, Junit 4.12, REST Assured 4.3.0, <br>
Maven (software project management) <br>

## Project structure
```text
-- automaton-v20
   |-- .gitignore
   `-- .github
       `-- workflows
          |-- maven.yml
   |-- LICENSE
   |-- pom.xml
   |-- README.md
   `-- src
       `-- test
           `-- java
               `-- restapitests
                  |-- RestApiTests.java
```

## The concept
The main reason was to understand how to use [REST assured](http://rest-assured.io/) to test and verify a REST API. For a target service, I used [one](https://github.com/BurhanH/api-app-3) of my projects that is living on [https://api-flask-baur.herokuapp.com](https://api-flask-baur.herokuapp.com). It's a simple REST API service to get popular quotes.

## Tests
[Tests](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java) are pretty straight. Each test verifies specific functionality like: [get a quote](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L20), [get a random quote](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L34), [try to get a quote that doesn't exist](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L46), [try to create a quote if a quote number already exists](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L72), [edit a quote](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L85), [create a quote](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L98), [delete a quote](https://github.com/BurhanH/Automaton-v20/blob/master/src/test/java/restapitests/RestApiTests.java#L111).
