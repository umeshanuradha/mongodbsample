package com.umesh.mongosample.controller;

import com.umesh.mongosample.entity.Users;
import com.umesh.mongosample.repository.UsersRepository;
import com.umesh.mongosample.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private MongoService mongoService;


    @RequestMapping(method = RequestMethod.GET, value = "/insert")
    public List<Users> insertAndShowData(){

        Users users = new Users();
        users.setAddress("xxxx");
        users.setPassword("pwd");
        users.setRole(1);
        users.setUsername("user100");

        usersRepository.save(users);

       return usersRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Users> getAllData(){

        return usersRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/get/{name}")
    public List<Users> getByUserName(@PathVariable String userName){
        return mongoService.getByUserName(userName);
    }






}
