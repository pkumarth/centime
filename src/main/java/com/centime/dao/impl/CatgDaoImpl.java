package com.centime.dao.impl;

import com.centime.dao.CatgDao;
import com.centime.ex.ErrorCode;
import com.centime.ex.NotFoundException;
import com.centime.models.Category;
import com.centime.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CatgDaoImpl implements CatgDao {
    @Autowired
    private CategoryRepository repository;

    public Category findCatg(Integer id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(ErrorCode.NoDataFound));
    }

    public List<Category> findAllCatg() {

        Iterable<Category> optional = repository.findAll();
        List<Category> catgs = new ArrayList<>();
        optional.forEach(catgs::add);
        if (catgs.size() == 0) {
            throw new NotFoundException(ErrorCode.NoDataFound);
        }
        return catgs;
    }

    public Category create(Category catg) {
        return repository.save(catg);

    }

    public Iterable<Category> createAllCatg(List<Category> catgs) {
        return repository.saveAll(catgs);
    }
}
