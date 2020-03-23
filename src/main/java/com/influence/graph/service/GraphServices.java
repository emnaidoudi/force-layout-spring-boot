package com.influence.graph.service;

public interface GraphServices {

    static Float calculateScore(Long nb_posts, Long nb_likes, Long nb_comments, float bias) {
        return (nb_likes +  nb_comments * bias )/nb_posts;
    }
}
