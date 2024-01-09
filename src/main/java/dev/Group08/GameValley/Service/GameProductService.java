package dev.Group08.GameValley.Service;

import dev.Group08.GameValley.Model.ReviewModel;
import dev.Group08.GameValley.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameProductService {
    @Autowired
    private ReviewRepository reviewRepository;

    public void addReview(String pID, String uID, String content) {
        ReviewModel newReview = new ReviewModel();

        newReview.setContent(content);
        newReview.setpID(pID);
        newReview.setuID(uID);
        newReview.setUpvote(0);
        newReview.setDownvote(0);

        reviewRepository.save(newReview);
    }

    public List<ReviewModel> getReviews(String pID) {
        return reviewRepository.getByProduct(pID);
    }
}
