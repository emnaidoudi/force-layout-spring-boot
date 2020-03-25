package com.influence.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;

public class Link {

    //private String idEdge; //AutoIncrement
    private String source;
    private String target;
    private Long nb_like;
    private Long nb_comments;
    private Float influenceScore; // Average

    public Link(String idSource, String idTarget, Long nb_like, Long nb_comments) {
        this.source = idSource;
        this.target = idTarget;
        this.nb_like = nb_like;
        this.nb_comments = nb_comments;
    }

    public Link() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    @JsonIgnore
    public Long getNb_like() {
        return nb_like;
    }

    public void setNb_like(Long nb_like) {
        this.nb_like = nb_like;
    }
    @JsonIgnore
    public Long getNb_comments() {
        return nb_comments;
    }

    public void setNb_comments(Long nb_comments) {
        this.nb_comments = nb_comments;
    }

    public Float getInfluenceScore() {
        return influenceScore;
    }

    public void setInfluenceScore(Float influenceScore) {
        this.influenceScore = influenceScore;
    }
}
