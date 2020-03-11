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
    @Autowired
    private IServiceEmployee serviceEmployee;

    @Autowired
    private IServiceLink iServiceLink;

    @GetMapping("/showEmployees")
    public @ResponseBody
    List<Dimemployee> findEmp() {
        return serviceEmployee.findAll();
    }

    @GetMapping("/showNodes")
    public @ResponseBody
    List<Node> findNodes() {
        return serviceEmployee.findNodes();
    }

    @GetMapping("/showLinks")
    public @ResponseBody
    List<Link> findLinks() {
        return iServiceLink.getLinks();
    }
}
