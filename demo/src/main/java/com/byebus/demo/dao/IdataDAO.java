package com.byebus.demo.dao;

import java.util.List;

import com.byebus.demo.model.data;

public interface IdataDAO {
    public List<data> getList();
    public data getById(Integer dataId);
    public String save(data data);
    public String update(data data);
    public String delete(Integer dataId);
}
