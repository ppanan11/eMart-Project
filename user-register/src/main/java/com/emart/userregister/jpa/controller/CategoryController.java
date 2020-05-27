package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * controller to get a category
     * @return
     */
    @RequestMapping(value = "/getCategory", method = RequestMethod.GET)
    List getCategory(){
        return categoryService.getCategory();
    }
}
