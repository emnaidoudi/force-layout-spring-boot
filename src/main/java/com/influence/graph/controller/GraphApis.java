package com.influence.graph.controller;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Graph;
import com.influence.graph.model.Link;
import com.influence.graph.model.Node;
import com.influence.graph.service.GraphServices;
import com.influence.graph.service.IServiceEmployee;
import com.influence.graph.service.IServiceLink;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@Controller
public class GraphApis {
    private final IServiceEmployee serviceEmployee;
    private final IServiceLink iServiceLink;

    public GraphApis(IServiceEmployee serviceEmployee, IServiceLink iServiceLink) {
        this.serviceEmployee = serviceEmployee;
        this.iServiceLink = iServiceLink;
    }

    @GetMapping("/showEmployees")
    public @ResponseBody
    List<Dimemployee> findEmp() {
        return serviceEmployee.findAll();
    }

    @GetMapping("/showNodes")
    public @ResponseBody
    List<Node> findNodes() {
        List<Node> nodes = serviceEmployee.findNodes();
        Collections.shuffle(nodes);
        return nodes.subList(0,30);
        //return serviceEmployee.findNodes();
    }

    @GetMapping("/showLinks")
    public @ResponseBody
    List<Link> findLinks() {
        return iServiceLink.getLinks();
    }

    @GetMapping("/showSites")
    public @ResponseBody
    List<String> findSites() {
        return serviceEmployee.listSites();
    }

    @GetMapping("/filter")
    public @ResponseBody
    List<String> filter(@RequestParam String filter) {
        if(filter.equals("site"))
        return serviceEmployee.listSites();
        else return null;
    }

    @GetMapping("/loadGraph")
    public @ResponseBody
    Graph loadGraph() {
        Graph graph= new Graph();
        List<Node> nodes = serviceEmployee.findNodes();
        List<Link> links = iServiceLink.getLinks();
        graph.setNodes(nodes);
        graph.setLinks(links);
        return graph;
    }
}
