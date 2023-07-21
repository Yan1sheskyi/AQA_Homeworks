package rest_homework_tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rest_homework.config.UsersHttpRequest;
import rest_homework.dto.usersDto.Person;
import rest_homework.dto.usersDto.User;

public class UserTests {

    private static UsersHttpRequest usersHttpRequest;

    @BeforeAll
    public static void init() {
        usersHttpRequest = new UsersHttpRequest();
    }

    @Test
    public void responceTest() {
        User responce = usersHttpRequest.getUsers(7)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getObject("data", User.class);
        System.out.println(responce);
    }

    @Test
    public void createUserTest() {
        Person p = new Person();
        p.setId("5");
        p.setName("Kevin");
        p.setJob("Driver");

        Person responce = usersHttpRequest.createUser(p)
                .then()
                .statusCode(201)
                .extract()
                .as(Person.class);
        Assertions.assertThat(p.getId()).isEqualTo("5");

    }
}
