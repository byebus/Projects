package com.byebus.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byebus.demo.dao.IdataDAO;
import com.byebus.demo.model.Employee;

@RestController
@RequestMapping(value="/Employee")
public class dataController {
    @Autowired
    IdataDAO dataDAO;

    @GetMapping(value = "/list")
    public List<Employee> getList() {

         return dataDAO.getList();
    }

    @GetMapping(value = "/get/{id}")
    public Employee getById(@PathVariable(value = "id") int empId) {

         return dataDAO.getById(empId);
    }

    @PostMapping(value = "/save")
    public String save(@Validated @RequestBody Employee data) {

         return dataDAO.save(data);
    }

    @PutMapping(value = "/update")
    public String update(@Validated @RequestBody Employee data) {

         return dataDAO.update(data);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int empId) {

         return dataDAO.delete(empId);
    }
}
