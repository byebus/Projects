package com.byebus.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.byebus.demo.model.Issue;
@Repository
public class IssueDAO implements IissuesDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Issue> getList() {
        return ((JdbcOperations) jdbcTemplate).query(
            "SELECT "
            +"issue_id,issue_name,description,status "
            +"FROM issues ",
            new BeanPropertyRowMapper<>(Issue.class));
    }
    @Deprecated
    @Override
    public Issue getById(Integer issueId) {
        return jdbcTemplate.queryForObject(
            "SELECT "
            +"issue_id,issue_name,description,status "
            +"FROM issues "
            +"WHERE user_id = ?",
            new Object[] {issueId},new BeanPropertyRowMapper<>(Issue.class));
    }


    @Override
    public String save(Issue issue) {
        ((JdbcOperations) jdbcTemplate).update(
            "INSERT INTO issues "
            +"(issue_name,description,status) "
            +"VALUES (?,?,?)",
            new Object[] {issue.getIssue_name(),issue.getDescription(),
                issue.getStatus()});

        return "Saved";
    }


    @Override
    public String update(Issue issue) {
        ((JdbcOperations) jdbcTemplate).update(
            "UPDATE issues "
            +"SET user_name = ?,user_surname = ?,email = ?,phone_no = ? "
            +"WHERE user_id = ?",
            new Object[] {issue.getIssue_name(),
                issue.getDescription(),issue.getStatus(),
                issue.getIssue_id()});
        return "Updated";
    }

    @Override
    public String delete(Integer issue_id) {
        jdbcTemplate.update(
            "DELETE FROM issues WHERE issue_id = ?",
            new Object[] {issue_id});
        return "Deleted";
    }

}
