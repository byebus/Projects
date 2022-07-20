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

import com.byebus.demo.dao.IissuesDAO;
import com.byebus.demo.model.Issue;

@RestController
@RequestMapping(value="/Issue")
public class issueController {
    @Autowired
    IissuesDAO issueDAO;
    @GetMapping(value = "/list")
    public List<Issue> getList() {

         return issueDAO.getList();
    }
    @GetMapping(value = "/get/{id}")
    public Issue getById(@PathVariable(value = "id") int issueId) {

         return issueDAO.getById(issueId);
    }
    @PostMapping(value = "/save")
    public String save(@Validated @RequestBody Issue issue) {

         return issueDAO.save(issue);
    }
    @PutMapping(value = "/update")
    public String update(@Validated @RequestBody Issue issue) {

         return issueDAO.update(issue);
    }
    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int issueId) {

         return issueDAO.delete(issueId);
    }
}
