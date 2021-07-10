package shop.watchawiki.api.users.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.watchawiki.api.reviews.domain.Reviews;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long userId;
    @Column private String userPw;
    @Column private String userGender;
    @Column private String userNation;
    @Column private String prefGenre;
    @Column private String prefDirector;
    @Column private String prefActor;
    @Column private String prefNation;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<Reviews> reviewsList;
}
