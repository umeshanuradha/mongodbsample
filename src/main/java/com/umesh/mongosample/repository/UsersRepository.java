package com.umesh.mongosample.repository;

import com.umesh.mongosample.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by umesh on 10/6/18.
 */
public interface UsersRepository extends MongoRepository<Users, String> {

}
