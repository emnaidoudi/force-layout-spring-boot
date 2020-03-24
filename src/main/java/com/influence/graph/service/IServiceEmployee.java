package com.influence.graph.service;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;

import java.util.List;

public interface IServiceEmployee {
    List<Dimemployee> findAll();
    List<Node> findNodes();
    List<String> listSites();
}
