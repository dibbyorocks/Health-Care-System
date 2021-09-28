package com.cg.healthcaresystem;

import com.cg.healthcaresystem.model.User;
import com.cg.healthcaresystem.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = true)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void addUserTestPass(){
       User user=new User("Mahesh","password","admin");
       User user2=new User("Rajesh","pass","user");
        Assert.assertEquals(user,userService.addUser(user));
        Assert.assertEquals(user2,userService.addUser(user2));
    }
    @Test
    public void addUserTestFails(){
        User user=new User("mahesh","password",null);
        User user2=new User("mahesh",null,"admin");
        User user3=new User(null,"Mahesh","user");
        Assert.assertEquals(user,userService.addUser(user));
        Assert.assertEquals(user,userService.addUser(user2));
        Assert.assertEquals(user,userService.addUser(user3));
    }

    @Test
    public  void validateTestPass(){

    }

}