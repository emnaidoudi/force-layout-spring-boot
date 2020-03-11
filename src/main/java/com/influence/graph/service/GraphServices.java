package com.influence.graph.service;

public interface GraphServices {

    static Float calculateScore(Long nb_likes, Long nb_comments, float bias) {
        return nb_likes + bias * nb_comments;
    }
}
