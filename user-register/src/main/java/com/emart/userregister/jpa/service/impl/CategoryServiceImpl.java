package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.repository.CategoryRepository;
import com.emart.userregister.jpa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    /**
     * impl to get a list of category
     * @return
     */
    @Override
    public List getCategory() {
        return categoryRepository.findAllCategory();
    }
}
