package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SearchIteamRepository extends JpaRepository<ItemsEntity,Integer> {

    /**
     * like query item
     * @param name
     * @return
     */
    List<ItemsEntity> findByItemNameLike(String name);


    /**
     * use custom query to random select 3 items to display on home page
     * @return
     */
    @Query(nativeQuery=true, value="SELECT * FROM items order by rand() LIMIT 3")
    List<ItemsEntity> findHomeItems();

}
