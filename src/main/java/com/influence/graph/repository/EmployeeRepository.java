package com.influence.graph.repository;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Dimemployee, String> {

    @Query("select new  com.influence.graph.model.Node(p.idemp, p.firstname, p.lastname,count(distinct fa.idpost), sum(fa.countlike), sum(fa.countcomment),1) from Factacceuil fa inner join Dimemployee p on fa.idemp=p.idemp group by p.idemp order by p.idemp")
    List<Node> getNodes();

    @Query("select new com.influence.graph.model.Node(p.idemp, p.firstname, p.lastname,1) from Dimemployee p where not exists (select idemp from Factacceuil fa where fa.idemp=p.idemp )")
    List<Node> getPassiveNodes();


}
