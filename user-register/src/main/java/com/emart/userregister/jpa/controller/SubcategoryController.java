package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubcategoryController {

    @Autowired
    SubcategoryService subcategoryService;

    /**
     * return a list of subcategory
     * @return
     */
    @RequestMapping(value = "/subcategory",method = RequestMethod.GET)
    List getSubcategory(){
        return subcategoryService.getSubcategory();
    }
}
