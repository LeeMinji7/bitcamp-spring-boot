package shop.watchawiki.api.reviews.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.watchawiki.api.movies.domain.Movies;
import shop.watchawiki.api.users.domain.Users;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long reviewId;

    @Column private long userId;
    @Column private long movieId;
    @Column private Date reviewDate;
    @Column private String comment;
    @Column private double ratingPoint;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Movies movie;
}
