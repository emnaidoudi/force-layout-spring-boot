package com.influence.graph.service;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import com.influence.graph.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ServiceEmployee implements IServiceEmployee{

    private float THRESHOLD = (float) 7;
    @Autowired
    private EmployeeRepository repository;
    @Override
    public List<Dimemployee> findAll() {
        return (List<Dimemployee>) repository.findAll();
    }


    @Override
    public List<Node> findNodes() {

        Random random = new Random();
        List<Node> nodes = repository.getNodes();
        nodes.forEach(node -> {
            Integer x =  random.nextInt(8);
            node.setScore(GraphServices.calculateScore(node.getNb_like(), node.getNb_comments(), 2));
            node.setInfluencerOrNot(node.getScore()>= THRESHOLD?true:false);
            node.setCategory(x); //node.isInfluencerOrNot()?1:2
        });
        return nodes;
    }

}
