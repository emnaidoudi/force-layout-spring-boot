package com.demo.lastika.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@Table(name = "link")
@IdClass(IdLink.class)
public class Link {

    @Id
    private String influencer;
    @Id
    private String influenced;
    private Integer nb_like;
    private Integer nb_comments;
    private Float score; // how much the influencer influences on the influenced :)

    public String getInfluencer() {
        return influencer;
    }

    public void setInfluencer(String influencer) {
        this.influencer = influencer;
    }

    public String getInfluenced() {
        return influenced;
    }

    public void setInfluenced(String influenced) {
        this.influenced = influenced;
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
}
