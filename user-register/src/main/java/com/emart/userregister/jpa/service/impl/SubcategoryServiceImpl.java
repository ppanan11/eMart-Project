package com.emart.userregister.jpa.service.impl;

import com.emart.userregister.jpa.repository.SubcategoryRepository;
import com.emart.userregister.jpa.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryServiceImpl implements SubcategoryService {

    @Autowired
    SubcategoryRepository subcategoryRepository;

    @Override
    public List getSubcategory() {
        return subcategoryRepository.findAllSubCategory();
    }
}
