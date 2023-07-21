package rest_homework.dto.usersDto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AuthInfo {
    private String email;
    private String password;
}
