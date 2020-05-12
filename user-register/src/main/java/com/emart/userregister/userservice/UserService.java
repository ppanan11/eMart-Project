package com.emart.userregister.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
  @RequestMapping(value="/login",method = RequestMethod.POST)
  public boolean login(@RequestParam("name") String name, @RequestParam("pwd") String pwd) throws Exception{
    return "admin".equals(name) & "pwd".equals(pwd);
  }


}
