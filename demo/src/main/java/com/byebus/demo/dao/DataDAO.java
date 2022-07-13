package com.byebus.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Repository;

import com.byebus.demo.model.Employee;
@Repository
public class DataDAO implements IdataDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> getList() {
        return ((JdbcOperations) jdbcTemplate).query(
            "SELECT "
            +"user_id,user_name,user_surname,email,phone_no "
            +"FROM users ",
            new BeanPropertyRowMapper<>(Employee.class));
    }
    @Deprecated
    @Override
    public Employee getById(Integer empId) {
        return jdbcTemplate.queryForObject(
            "SELECT "
            +"user_id,user_name,user_surname,email,phone_no "
            +"FROM users "
            +"WHERE user_id = ?",
            new Object[] {empId},new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public String save(Employee employee) {
        ((JdbcOperations) jdbcTemplate).update(
            "INSERT INTO users "
            +"(user_name,user_surname,email,phone_no) "
            +"VALUES (?,?,?,?)",
            new Object[] {employee.getUser_name(),employee.getUser_surname(),
                employee.getEmail(),employee.getPhoneNo()});

        return "Saved";
    }

    @Override
    public String update(Employee data) {
        ((JdbcOperations) jdbcTemplate).update(
            "UPDATE users "
            +"SET emp_name = ?,designation = ?,address = ?,phone_no = ? "
            +"WHERE emp_id = ?",
            new Object[] {data.getUser_name(),
                data.getUser_surname(),data.getEmail(),
                data.getPhoneNo(),data.getUser_id()});
        return "Updated";
    }

    @Override
    public String delete(Integer dataId) {
        // TODO Auto-generated method stub
        return null;
    }

    }


