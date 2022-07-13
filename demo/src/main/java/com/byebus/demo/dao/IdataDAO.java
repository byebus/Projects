package com.byebus.demo.dao;

import java.util.List;

import com.byebus.demo.model.Employee;

public interface IdataDAO {
    public List<Employee> getList();
    public Employee getById(Integer user_id);
    public String save(Employee employee);
    public String update(Employee employee);
    public String delete(Integer user_id);
}
