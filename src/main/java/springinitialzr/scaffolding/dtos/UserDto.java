package springinitialzr.scaffolding.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private Long id;

    @JsonProperty("username")
    private String username;

    @Email(message = "Invalid email format")
    private String email;
}
