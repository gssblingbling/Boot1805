package com.blingbling.boot1805.controller;

import com.blingbling.boot1805.pojo.QfWork;
import com.blingbling.boot1805.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WorkController {
@Autowired
    private WorkService workService;

//新增
    @RequestMapping("/workadd")
    @ResponseBody
    public String save(QfWork work) {
        if (workService.save(work) != null) {
            return "success";
        } else  {
            return  "error";
        }
    }

    //jpql查询
    @RequestMapping("/workall2")
    @ResponseBody
    public List<QfWork> query1() {
        return  workService.query1();
    }

    //sql查询
    @RequestMapping("/workall3")
    @ResponseBody
    public List<QfWork> query2(){
        return workService.query2();
    }
    //方法名解析查询
    @RequestMapping("/workall4")
    @ResponseBody
    public QfWork query3(String name){
        return workService.query3(name);
    }
    //查询
    @RequestMapping("/workall")
    @ResponseBody
    public List<QfWork> query4(){
        return null;
    }

}
