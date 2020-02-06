package com.mastertheboss.springboot.springbootwildfly.repository;

import com.mastertheboss.springboot.springbootwildfly.model.Datas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataValueRepository extends CrudRepository<Datas, Integer> {
    List<Datas> findAllByDateBetweenOrderByDateAsc(String startDate, String endDate);

    List<Datas> findAllByDateBetweenOrderByValue(String startDate, String endDate);

//    @Query(value = "select new Datas(d.value, d.date) from Datas d where d.date between ?1 And ?2 order by d.date asc")
//    List<Datas> findByDateBetween(String startDate, String endDate);

    @Query(value = "select new Datas(d.value, d.date) from Datas d where d.date between ?1 And ?2 order by d.date asc")
    List<Datas.DataValues> findDateBetween(String startDate, String endDate);

}
