package shop.watchawiki.api.users.domain;

import lombok.Data;

@Data
public class UsersDto {
    private long userId;
    private String userPw;
    private String userGender;
    private String userNation;
    private String prefGenre;
    private String prefDirector;
    private String prefActor;
    private String prefNation;
}
