package com.influence.graph.controller;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import com.influence.graph.service.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class GraphApis {
    @Autowired
    private IServiceEmployee serviceEmployee;

    @GetMapping("/showEmployees")
    public @ResponseBody
    List<Dimemployee> findEmp() {
        return serviceEmployee.findAll();
    }
    @GetMapping("/showNodes")
    public @ResponseBody
    List<Node> findObjects() {
        return serviceEmployee.findNodes();
    }
}
