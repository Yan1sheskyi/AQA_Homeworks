package rest_homework.config;

import rest_homework.dto.usersDto.Person;
import io.restassured.response.Response;

public class UsersHttpRequest extends BaseHttpRequest {
    private static final String USER_URL = "api/users";

    public Response getUsers(int id) {
        return getRequestSpecification()
                .when()
                .get(USER_URL +"/"+ id);
    }

    public Response createUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .post(USER_URL);
    }
}
