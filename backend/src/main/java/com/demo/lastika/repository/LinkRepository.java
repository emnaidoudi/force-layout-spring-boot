package com.demo.lastika.repository;

import com.demo.lastika.model.Link;
import com.demo.lastika.model.Node;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends CrudRepository<Link, String> {
    @Query(value = "select factAccuiel.id_emp as influencer, factReact.id_emp as influenced , " +
            " count(factReact.id_like) as nb_like," +
            " count(factReact.id_comment) as nb_comments, " +
            "null as score "+
            "from  factReact inner join factAccuiel on factAccuiel.id_post = factReact.id_post" +
            "\nGROUP by factAccuiel.id_emp , factReact.id_emp ",nativeQuery = true)
    public List<Link> getLinks();
}
