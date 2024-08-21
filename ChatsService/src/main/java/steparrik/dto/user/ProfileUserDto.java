package steparrik.dto.user;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfileUserDto {
    private Long id;

    private String username;

    private String phoneNumber;

    private String fullName;

    private String pathToAvatar;

}
