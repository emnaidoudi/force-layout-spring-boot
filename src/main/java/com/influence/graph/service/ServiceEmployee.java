package com.influence.graph.service;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import com.influence.graph.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployee implements IServiceEmployee{

    private float THRESHOLD = (float) 7;
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Dimemployee> findAll() {
        return (List<Dimemployee>) repository.findAll();
    }

    private Float calculateScore(Long nb_likes, Long nb_comments, float bias){
        return nb_likes + bias * nb_comments;
    }
    @Override
    public List<Node> findNodes() {
        List<Node> nodes = repository.getNodes();
        nodes.forEach(node -> {
            node.setScore(calculateScore(node.getNb_like(), node.getNb_comments(), 2));
            node.setInfluencerOrNot(node.getScore()>= THRESHOLD?true:false);
        });
        return nodes;
    }

    @Override
    public String findNameById(String id) {
        return repository.findNameById(id);
    }
}
