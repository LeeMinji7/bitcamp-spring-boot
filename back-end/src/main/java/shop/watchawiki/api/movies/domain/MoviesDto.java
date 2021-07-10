package shop.watchawiki.api.movies.domain;

import lombok.Data;

import java.util.Date;

@Data
public class MoviesDto {
    private long movieId;   // 영화코드

    private long nationId;  // 국가코드
    private long directorId;    // 감독코드
    private long genreId;   // 장르코드

    private String movieName;   // 영화제목
    private Date releaseDate;   // 개봉날짜
    private int runningTime;    // 상영시간
    private int filmRating;     // 상영등급
    private int boxOffice;      // 관객수
    private String summary;     // 줄거리
    private String awards;      // 수상내역
    private String movieProfile;    // 영화이미지
}
