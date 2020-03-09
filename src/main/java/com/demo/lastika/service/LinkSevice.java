package com.demo.lastika.service;

import com.demo.lastika.model.Link;
import com.demo.lastika.model.Node;
import com.demo.lastika.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkSevice implements ILinkService {
    @Autowired
    private LinkRepository repository;

    @Override
    public List<Link> findAll() {
        return repository.getLinks();


    }


}
