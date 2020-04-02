package com.influence.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Calcul de score
// le filter (category)
//@Entity
public class Node {

    private Dimemployee employee;
    private String employeeId;
    private String name;
    private Long nb_posts;
    private Long nb_like;
    private Long nb_comments;
    private Float score;
    private boolean influencerOrNot;
    private String category; // the site for now : represents the filter

    public Node(Dimemployee employee, Long nb_posts, Long nb_like, Long nb_comments , String category ) {
       this.employeeId = employee.getIdemp();
        this.employee = employee;
        this.name = employee.getFirstname() + " " + employee.getLastname();
        this.nb_like = nb_like;
        this.nb_comments = nb_comments;
        this.category  = category;
        this.nb_posts=nb_posts;
    }

    // for the employee who has never posted a post
    public Node(Dimemployee employee,  String category ) {
       this.employee = employee;
        this.employeeId = employee.getIdemp();
        this.name = employee.getFirstname() + " " + employee.getLastname();
        this.category  = category;
        //this.score = 0F;
    }

/*    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }*/

    public Dimemployee getEmployee() {
        return employee;
    }

    public void setEmployee(Dimemployee employee) {
        this.employee = employee;
    }

    public Long getNb_posts() {
        return nb_posts;
    }

    public void setNb_posts(Long nb_posts) {
        this.nb_posts = nb_posts;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getId() {
        return employeeId;
    }

    public void setId(String employeeId) {
        employeeId = employeeId;
    }

    public Node() {
    }

}
