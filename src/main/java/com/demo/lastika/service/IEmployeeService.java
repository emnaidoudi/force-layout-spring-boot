package com.demo.lastika.service;

import com.demo.lastika.model.Employee;
import com.demo.lastika.model.Node;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(String id);
    String findNameById(String id);
    //List<Object> findObjects();
    List<Node> findNodes();

}
