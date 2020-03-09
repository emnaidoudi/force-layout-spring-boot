package com.demo.lastika.controller;

import com.demo.lastika.model.Employee;
import com.demo.lastika.model.Link;
import com.demo.lastika.model.Node;
import com.demo.lastika.service.IEmployeeService;
import com.demo.lastika.service.ILinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Controller
public class MyController {

    @Autowired
    private ILinkService LinkService;
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/showLinks")
    public @ResponseBody
    List<Link> findFacts() {
        return LinkService.findAll();
    }

    @GetMapping("/showEmployees")
    public @ResponseBody
    List<Employee> findEmp() {
        return iEmployeeService.findAll();
    }

    @GetMapping("/showEmployeesById")
    public @ResponseBody
    Optional<Employee> findEmpById() {
        return iEmployeeService.findById("emna");
    }

    @GetMapping("/showNameById")
    public @ResponseBody
    String findNameById() {
        return iEmployeeService.findNameById("emna");
    }

    @GetMapping("/showNodes")
    public @ResponseBody
    List<Node> findObjects() {
        return iEmployeeService.findNodes();
    }


}
