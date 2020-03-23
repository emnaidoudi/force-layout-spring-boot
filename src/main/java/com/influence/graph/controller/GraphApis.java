package com.influence.graph.controller;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Link;
import com.influence.graph.model.Node;
import com.influence.graph.service.IServiceEmployee;
import com.influence.graph.service.IServiceLink;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Convert;
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
//        List<Node> nodes = serviceEmployee.findNodes();
//        return nodes.subList(0,15);
        return serviceEmployee.findNodes();
    }

    @GetMapping("/showLinks")
    public @ResponseBody
    List<Link> findLinks() {
        return iServiceLink.getLinks();
    }
}
