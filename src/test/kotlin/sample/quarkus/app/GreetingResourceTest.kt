package sample.quarkus.app

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

@QuarkusTest
open class GreetingResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
                .`when`().get("/hello")
                .then()
                .statusCode(200)
                .body("message", equalTo("hello"))
    }
}