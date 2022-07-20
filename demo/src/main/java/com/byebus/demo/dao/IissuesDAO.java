package com.byebus.demo.dao;

import java.util.List;

import com.byebus.demo.model.Issue;

public interface IissuesDAO {

        public List<Issue> getList();
        public Issue getById(Integer user_id);
        public String save(Issue issue);
        public String update(Issue issue);
        public String delete(Integer issue_id);

}
