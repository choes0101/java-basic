package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        movieReviews[1] = aboutTime;


        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
        System.out.println("영화 제목: " + movieReviews[0].title + ", 리뷰: " + movieReviews[0].review);
        System.out.println("영화 제목: " + movieReviews[1].title + ", 리뷰: " + movieReviews[1].review);
        for (int i = 0; i < movieReviews.length; i++){
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }
        for (int i = 0; i < movieReviews.length; i++){
            MovieReview m = movieReviews[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
        for (MovieReview m : movieReviews){
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

    }
}
