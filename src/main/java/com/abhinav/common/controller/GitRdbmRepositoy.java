package com.abhinav.common.controller;


import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GitRdbmRepositoy extends CrudRepository<GitModel,String> {

}
