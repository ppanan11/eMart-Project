package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.SubcategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubcategoryRepository extends JpaRepository<SubcategoryEntity,Integer> {

    @Query(nativeQuery=true, value="SELECT distinct subcategory_name FROM subcategory")
    List findAllSubCategory();
}
