package rest_homework_tests;


import io.restassured.path.json.JsonPath;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest_homework.config.LoginHttpRequest;
import rest_homework.dto.usersDto.AuthInfo;

public class LoginTests {
    private static LoginHttpRequest loginHttpRequest;

    @BeforeAll
    public static void getLoginHttpRequest() {
        loginHttpRequest = new LoginHttpRequest();
    }

    @Test
    public void loginTest() {
        String expectedToken;
        expectedToken = "QpwL5tke4Pnpja7X2";
        AuthInfo auth = new AuthInfo("janet.weaver@reqres.in", "F-22_Raptor");
        String actualToken = loginHttpRequest.login(auth)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getObject("token", String.class);
        Assertions.assertThat(actualToken).isEqualTo(expectedToken);
    }

    @Test
    public void missingPasswordTest() {
        String expected;
        expected = "Missing password";
        AuthInfo auth = new AuthInfo("eve.holt@reqres.in", "");
        String actual = loginHttpRequest.login(auth)
                .then()
                .statusCode(400)
                .extract()
                .body()
                .jsonPath()
                .getObject("error", String.class);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void wrongUserTest() {
        String expected;
        expected = "user not found";
        AuthInfo auth = new AuthInfo("Ukrainian@F-16.net", "F-16_Falcon");
        String actual = loginHttpRequest.login(auth)
                .then()
                .statusCode(400)
                .extract()
                .body()
                .jsonPath()
                .getObject("error", String.class);
        Assertions.assertThat(actual).isEqualTo(expected);

    }
}
