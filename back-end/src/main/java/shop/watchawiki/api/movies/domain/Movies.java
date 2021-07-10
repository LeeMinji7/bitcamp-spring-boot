package shop.watchawiki.api.movies.domain;

import lombok.*;
import shop.watchawiki.api.reviews.domain.Reviews;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long movieId;   // 영화코드

    @Column private long nationId;  // 국가코드
    @Column private long directorId;    // 감독코드
    @Column private long genreId;   // 장르코드

    @Column private String movieName;   // 영화제목
    @Column private Date releaseDate;   // 개봉날짜
    @Column private int runningTime;    // 상영시간
    @Column private int filmRating;     // 상영등급
    @Column private int boxOffice;      // 관객수
    @Column private String summary;     // 줄거리
    @Column private String awards;      // 수상내역
    @Column private String movieProfile;    // 영화이미지

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movies")
    private List<Reviews> reviewsList;
}
