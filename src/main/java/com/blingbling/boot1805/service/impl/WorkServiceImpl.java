package com.blingbling.boot1805.service.impl;

import com.blingbling.boot1805.dao.WorkDao;
import com.blingbling.boot1805.pojo.QfWork;
import com.blingbling.boot1805.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkDao workDao;

    @Override
    public QfWork save(QfWork work) {
        return workDao.save(work);
    }

    @Override
    public List<QfWork> queryAll() {
        return workDao.findAll();
    }

    @Override
    public List<QfWork> query1() {
        return workDao.dataAll1();
    }

    @Override
    public List<QfWork> query2() {
        return workDao.dataAll2();
    }

    @Override
    public QfWork query3(String name) {
        return workDao.getByName(name);
    }

    @Override
    public List<QfWork> query4() {
        return null;
    }
}
