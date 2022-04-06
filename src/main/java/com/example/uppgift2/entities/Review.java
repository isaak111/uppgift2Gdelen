package com.example.uppgift2.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String reviewTitle;

    @Column
    private String reviewText;

    @Column
    private String reviewPlus;

    @Column
    private String reviewMinus;

    @Column
    @Size(min= 0, max= 5)
    private int ReviewScore;

    @ManyToOne
    @JoinColumn(name = "appuser_id")
    private AppUser appUser;

    public Review(String reviewTitle, String reviewText, String reviewPlus, String reviewMinus, int reviewScore, AppUser appUser) {
        this.reviewTitle = reviewTitle;
        this.reviewText = reviewText;
        this.reviewPlus = reviewPlus;
        this.reviewMinus = reviewMinus;
        ReviewScore = reviewScore;
        this.appUser = appUser;
    }

    public Review() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getReviewPlus() {
        return reviewPlus;
    }

    public void setReviewPlus(String reviewPlus) {
        this.reviewPlus = reviewPlus;
    }

    public String getReviewMinus() {
        return reviewMinus;
    }

    public void setReviewMinus(String reviewMinus) {
        this.reviewMinus = reviewMinus;
    }

    public int getReviewScore() {
        return ReviewScore;
    }

    public void setReviewScore(int reviewScore) {
        ReviewScore = reviewScore;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", reviewTitle='" + reviewTitle + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", reviewPlus='" + reviewPlus + '\'' +
                ", reviewMinus='" + reviewMinus + '\'' +
                ", ReviewScore=" + ReviewScore +
                ", appUser=" + appUser +
                '}';
    }
}
