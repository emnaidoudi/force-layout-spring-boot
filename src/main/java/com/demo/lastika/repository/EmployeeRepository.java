package com.demo.lastika.repository;

import com.demo.lastika.model.Employee;
import com.demo.lastika.model.Node;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, String> {
    @Query("select e.name from Employee e where e.id = ?1")
    public String findNameById(String id);
//
//    @Query(value = "select factAccuiel.id_emp as influencer, count(factReact.id_like)+count(factReact.id_comment)*2 as moy_react from  factReact inner join factAccuiel on factAccuiel.id_post = factReact.id_post\nGROUP by factAccuiel.id_emp",nativeQuery = true)
//    public List<Object> getNodes();

    @Query(value = "select factAccuiel.id_emp as id, null as name ,  null as score, false as influencer_or_not,null as category, count(factReact.id_like) as nb_like, count(factReact.id_comment) as nb_comments from  factReact inner join factAccuiel on factAccuiel.id_post = factReact.id_post\nGROUP by factAccuiel.id_emp",nativeQuery = true)
    public List<Node> getNodes();
}
