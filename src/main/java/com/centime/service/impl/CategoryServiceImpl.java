package com.centime.service.impl;

import com.centime.dao.CatgDao;
import com.centime.dto.CatgTree;
import com.centime.helper.ParentChild;
import com.centime.models.Category;
import com.centime.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CatgDao catgDao;

    @Override
    public Map<Integer, CatgTree> findCatgs() {
        List<Category> catgs = catgDao.findAllCatg();
        ParentChild pc = new ParentChild();
        Map<Integer, CatgTree> resultMap = pc.populateResult(catgs);
        return resultMap;
    }

    @Override
    public CatgTree findCatg(Integer id) {
        List<Category> catgs = catgDao.findAllCatg();
        ParentChild pc = new ParentChild();
        Map<Integer, CatgTree> resultMap = pc.populateResult(catgs);
        return resultMap.get(id);
    }

}
