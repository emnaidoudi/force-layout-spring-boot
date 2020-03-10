package com.influence.graph.model;

import javax.persistence.Entity;

@Entity
public class Node extends Dimemployee {
    private String name;
    private Integer nb_like;
    private Integer nb_comments;
    private Float score;
    private boolean influencerOrNot;
    private String category;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
}
