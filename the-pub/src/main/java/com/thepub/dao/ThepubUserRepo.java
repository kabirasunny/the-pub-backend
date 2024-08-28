package com.thepub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubUser;

@Repository
public interface ThepubUserRepo extends CrudRepository<ThepubUser, Integer>{

}
