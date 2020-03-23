package com.influence.graph.repository;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Link;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends CrudRepository<Dimemployee, String> {

    @Query("select new com.influence.graph.model.Link(fa.idemp, fi.idemp  , count(fi.idreact) ," +
            " count(fi.idcom)) " +
            " from Factinteract fi " +
            "INNER JOIN Factacceuil fa " +
            "on fa.idpost = fi.idpost  " +
            "group by fa.idemp, fi.idemp   ")
    List<Link> getLinks();
}
