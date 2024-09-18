package com.thepub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubContact;

@Repository
public interface ThepubContactRepo extends CrudRepository<ThepubContact, Integer> {

}
