package com.blingbling.boot1805.service;

import com.blingbling.boot1805.pojo.QfWork;

import java.util.List;

public interface WorkService {
    //新增
    QfWork save(QfWork work);

    //查询
    List<QfWork> queryAll();

    //jpql
    List<QfWork> query1();

    //sql
    List<QfWork> query2();

    //方法名解析
    QfWork query3(String name);

    //命名查询
    List<QfWork> query4();
}
