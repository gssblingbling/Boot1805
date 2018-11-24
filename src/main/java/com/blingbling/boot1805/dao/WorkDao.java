package com.blingbling.boot1805.dao;

import com.blingbling.boot1805.pojo.QfWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkDao extends JpaRepository<QfWork,Integer> {
    //JPQ 面向对象查询语言
    @Query(value = "from QfWork ")
    public List<QfWork> dataAll1();

    //Spring Data JPA支持原生sql
    @Query(value = "select * from t_work",nativeQuery = true)
    public List<QfWork> dataAll2();

    //方法名解析查询
    public QfWork getByName(String name);
}
