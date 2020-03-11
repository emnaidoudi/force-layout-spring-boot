package com.influence.graph.model;

//@Entity
public class Node {

    private String EmployeeId;
    private String name;
    private Long nb_like;
    private Long nb_comments;
    private Float score;
    private boolean influencerOrNot;
    private Integer category;

    public Node(String EmployeeId, String name, Long nb_like,Long nb_comments  ) {
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.nb_like = nb_like;
        this.nb_comments = nb_comments;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getNb_like() {
        return nb_like;
    }

    public void setNb_like(Long nb_like) {
        this.nb_like = nb_like;
    }

    public Long getNb_comments() {
        return nb_comments;
    }

    public void setNb_comments(Long nb_comments) {
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getId() {
        return EmployeeId;
    }

    public void setId(String employeeId) {
        EmployeeId = employeeId;
    }

    public Node() {
    }

}
