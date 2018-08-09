package com.example.demo.service;


import com.example.demo.dao.UserRepositoty;
import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user=null;
        try {
            user = userRepositoty.findByName(name);
        }catch (Exception e){}
        return user;
    }

}
