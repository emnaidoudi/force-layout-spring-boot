package com.influence.graph.service;

import com.influence.graph.model.Link;
import com.influence.graph.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLink  implements IServiceLink{

    @Autowired
    private LinkRepository repository;

    @Override
    public List<Link> getLinks() {
        List<Link> links =  repository.getLinks();
        links.forEach(link -> {
            link.setInfluenceScore(GraphServices.calculateScore(link.getNb_like(), link.getNb_comments(), 2));
        });
        return links;
    }

}
