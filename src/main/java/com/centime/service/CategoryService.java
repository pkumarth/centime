package com.centime.service;

import com.centime.dto.CatgTree;
import com.centime.models.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    public Map<Integer, CatgTree> findCatgs();

    public CatgTree findCatg(Integer id);

}
