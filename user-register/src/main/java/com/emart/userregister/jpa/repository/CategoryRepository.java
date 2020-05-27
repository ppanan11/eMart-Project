package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.CategoryEntity;
import com.emart.userregister.jpa.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

    /**
     * get category list
     * @return
     */
    @Query(nativeQuery=true, value="SELECT distinct category_name FROM category")
    List findAllCategory();
}
