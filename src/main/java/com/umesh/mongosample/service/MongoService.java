package com.umesh.mongosample.service;

import com.umesh.mongosample.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by umesh_w on 10/11/2018.
 */
@Service
public class MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Users> getByUserName(String userName){


        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(userName));
        List<Users> userList =  mongoTemplate.find(query, Users.class);

        return userList;
    }

}
