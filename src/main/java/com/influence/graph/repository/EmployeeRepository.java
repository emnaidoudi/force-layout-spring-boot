package com.influence.graph.repository;

import com.influence.graph.model.Dimemployee;
import com.influence.graph.model.Node;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Dimemployee, String> {

    @Query("select new  com.influence.graph.model.Node(p.idemp, p.firstname, p.lastname,count(distinct fa.idpost), sum(fa.countlike), sum(fa.countcomment),p.site) from Factacceuil fa inner join Dimemployee p on fa.idemp=p.idemp where  p.leavereason is null group by p.idemp order by p.idemp ")
    List<Node> getNodes();

    @Query("select new com.influence.graph.model.Node(p.idemp, p.firstname, p.lastname,p.site) from Dimemployee p where not exists (select fa.idemp from Factacceuil fa where fa.idemp=p.idemp ) and p.leavereason is null")
    List<Node> getPassiveNodes();

    @Query("select distinct site from Dimemployee where site is not null ")
    List<String> listSite();


}
