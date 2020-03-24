package com.influence.graph.service;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import com.influence.graph.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ServiceEmployee implements IServiceEmployee{

    private float THRESHOLD = (float) 7;
    private final EmployeeRepository repository;

    public ServiceEmployee(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Dimemployee> findAll() {
        return (List<Dimemployee>) repository.findAll();
    }


    @Override
    public List<Node> findNodes() {
        List<Node> passifNodes = repository.getPassiveNodes();
        List<Node> nodes = repository.getNodes();
        nodes.forEach(node -> {
            node.setScore(GraphServices.calculateScore(node.getNb_posts(),node.getNb_like(), node.getNb_comments(), 2));
            node.setInfluencerOrNot(node.getScore()>= THRESHOLD?true:false);
        });
        List<Node> allNodes = Stream.concat(nodes.stream(), passifNodes.stream())
                .collect(Collectors.toList());
        System.out.println(allNodes.size());
        return allNodes;
    }

    @Override
    public List<String> listSites() {
        return repository.listSite();
    }

}
