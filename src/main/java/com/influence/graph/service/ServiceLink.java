package com.influence.graph.service;

import com.influence.graph.model.Link;
import com.influence.graph.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceLink  implements IServiceLink{

    @Autowired
    private LinkRepository repository;

    @Override
    public List<Link> getLinks() {
        List<Link> links =  repository.getLinks();
        links.forEach(link -> {
            Float score = GraphServices.calculateScore(1L,link.getNb_like(), link.getNb_comments(), 1);
            link.setInfluenceScore(score);
        });
        List<Link> sortByInfluenceScore = links.stream()
                .filter(i -> i.getInfluenceScore() >40)
                .sorted(Comparator.comparingDouble(Link::getInfluenceScore))
                .collect(Collectors.toList());
        return sortByInfluenceScore;
    }

}
