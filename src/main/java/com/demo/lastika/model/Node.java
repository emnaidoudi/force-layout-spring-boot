package com.demo.lastika.model;

import javax.persistence.Entity;

@Entity
public class Node extends Employee {

    private Integer nb_like;
    private Integer nb_comments;
    private Float score;
    private boolean influencerOrNot;
    private String category;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public boolean isInfluencerOrNot() {
        return influencerOrNot;
    }

    public void setInfluencerOrNot(boolean influencerOrNot) {
        this.influencerOrNot = influencerOrNot;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNb_like() {
        return nb_like;
    }

    public void setNb_like(Integer nb_like) {
        this.nb_like = nb_like;
    }

    public Integer getNb_comments() {
        return nb_comments;
    }

    public void setNb_comments(Integer nb_comments) {
        this.nb_comments = nb_comments;
    }


}
