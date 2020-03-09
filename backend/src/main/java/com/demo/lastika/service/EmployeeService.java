package com.demo.lastika.service;

import com.demo.lastika.model.Employee;
import com.demo.lastika.model.Node;
import com.demo.lastika.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    private float THRESHOLD = (float) 7;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public String findNameById(String id) {
        return employeeRepository.findNameById(id);
    }

    private Float calculateScore(Integer nb_likes, Integer nb_comments, float bias){
        return nb_likes + bias * nb_comments;
    }
    @Override
    public List<Node> findNodes() {
        List<Node> nodes = employeeRepository.getNodes();
        nodes.forEach(node -> {
            node.setScore(calculateScore(node.getNb_like(), node.getNb_comments(), 2));
            node.setInfluencerOrNot(node.getScore()>= THRESHOLD?true:false);
            node.setName(this.findNameById(node.getId()));
        });
        return nodes;
    }

//    @Override
//    public List<Node> findObjects() {
//        return employeeRepository.getNodes();
//    }
}
