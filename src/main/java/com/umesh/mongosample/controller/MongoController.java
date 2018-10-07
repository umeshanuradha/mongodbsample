package com.umesh.mongosample.controller;

import com.umesh.mongosample.entity.Users;
import com.umesh.mongosample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by umesh on 10/7/18.
 */
@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    private UsersRepository usersRepository;


    @RequestMapping(method = RequestMethod.GET, value = "/insert")
    public List<Users> insertAndShowData(){

        Users users = new Users();
        users.setAddress("xxxx");
        users.setPassword("pwd");
        users.setRole(1);
        users.setUsername("new User");

        usersRepository.save(users);

       return usersRepository.findAll();

    }





}
