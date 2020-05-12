package com.emart.userregister;

import com.emart.userregister.jpa.controller.BuyerController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class UserRegisterApplicationTests {

  @Autowired
  private BuyerController buyerController;


  /**
   * test for the BuyerController to get all buyers info
   */
  @Test
  public void getAllUsers(){
    System.out.println(buyerController.findAll());
  }
//
  @Test
  void contextLoads() {
    getAllUsers();
    }


}
