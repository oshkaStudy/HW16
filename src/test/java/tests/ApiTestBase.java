package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class ApiTestBase {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api";
    }

}
