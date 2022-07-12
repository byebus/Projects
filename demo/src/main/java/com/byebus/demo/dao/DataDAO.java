package com.byebus.demo.dao;

import java.util.List;

import com.byebus.demo.model.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class DataDAO implements IdataDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<data> getList() {
        return ((JdbcOperations) jdbcTemplate).query(
            "SELECT "
            +"user_id,user_name,user_surname,email,phoneNo "
            +"FROM data ",
            new BeanPropertyRowMapper<>(data.class));
    }
    @Deprecated
    @Override
    public data getById(Integer empId) {
        return jdbcTemplate.queryForObject(
            "SELECT "
            +"user_id,user_name,user_surname,email,phoneNo "
            +"FROM data "
            +"WHERE user_id = ?",
            new Object[] {empId},new BeanPropertyRowMapper<>(data.class));
    }

    @Override
    public String save(data data) {
        ((JdbcOperations) jdbcTemplate).update(
            "INSERT INTO data "
            +"(emp_name,designation,address,phone_no) "
            +"VALUES (?,?,?,?)",
            new Object[] {data.getEmpName(),data.getDesignation(),
                data.getAddress(),data.getPhoneNo()});

        return "Saved";
    }

    @Override
    public String update(data data) {
        ((JdbcOperations) jdbcTemplate).update(
            "UPDATE emp_master "
            +"SET emp_name = ?,designation = ?,address = ?,phone_no = ? "
            +"WHERE emp_id = ?",
            new Object[] {data.getEmpName(),
                data.getDesignation(),data.getAddress(),
                data.getPhoneNo(),data.getEmpId()});
        return "Updated";
    }

    @Override
    public String delete(Integer dataId) {
        // TODO Auto-generated method stub
        return null;
    }

    }


