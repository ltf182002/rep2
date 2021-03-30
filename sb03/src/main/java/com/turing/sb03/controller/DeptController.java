package com.turing.sb03.controller;

import com.turing.sb03.entity.Dept;
import com.turing.sb03.dao.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    //依赖Dao层
    @Autowired
    private DeptRepository repository;

    //查询所有部门信息
    @GetMapping("/")
    public List<Dept> list(){
        return repository.findAll();
    }

}
