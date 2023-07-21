package rest_homework.config;

import io.restassured.response.Response;
import rest_homework.dto.usersDto.AuthInfo;

public class LoginHttpRequest extends BaseHttpRequest{
    private static final String LOGIN_URL = "api/login";

    public Response login(AuthInfo authInfo) {
        return getRequestSpecification()
                .when()
                .body(authInfo)
                .post(LOGIN_URL);
    }

    public Response login(String email) {
        return getRequestSpecification()
                .when()
                .body(email)
                .post(LOGIN_URL);
    }
}
