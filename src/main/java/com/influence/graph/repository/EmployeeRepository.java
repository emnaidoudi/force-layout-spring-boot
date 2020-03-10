package com.influence.graph.repository;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Dimemployee, String> {
    @Query("select e.firstname from Dimemployee e where e.idemp = ?1")
    public String findNameById(String id);
//
//    @Query(value = "select factAccuiel.id_emp as influencer, count(factReact.id_like)+count(factReact.id_comment)*2 as moy_react from  factReact inner join factAccuiel on factAccuiel.id_post = factReact.id_post\nGROUP by factAccuiel.id_emp",nativeQuery = true)
//    public List<Object> getNodes();

    @Query(value = "select factacceuil.idemp as idemp, null as name, null as firstname , null as birthday, null as civility, null as sexe, null as lastname, null as score, false as influencer_or_not,null as category, count(factinteract.idreact) as nb_like, count(factinteract.idcom) as nb_comments from  factinteract inner join factacceuil on factacceuil.idpost = factinteract.idpost\nGROUP by factacceuil.idemp",nativeQuery = true)
    public List<Node> getNodes();
}
