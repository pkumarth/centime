package com.centime.dao;

import com.centime.models.Category;

import java.util.List;

public interface CatgDao {
    public Category findCatg(Integer id);

    public List<Category> findAllCatg();
}
