package com.byebus.demo.dao;

import java.util.List;

import com.byebus.demo.model.Employee;
import com.byebus.demo.model.Issue;

public interface IdataDAO {
    public List<Employee> getList();
    public Employee getById(Integer user_id);
    public String save(Employee employee);
    public String update(Employee employee);
    public String delete(Integer user_id);
    public  List<Issue> getUserIssuesById(Integer user_id);
}
