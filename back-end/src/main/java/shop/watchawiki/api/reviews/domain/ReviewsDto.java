package shop.watchawiki.api.reviews.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ReviewsDto {
    private long reviewId;
    private long userId;
    private long movieId;
    private Date reviewDate;
    private String comment;
    private double ratingPoint;
}
