package com.thepub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubTable;

@Repository
public interface ThepubTableRepo extends CrudRepository<ThepubTable, Integer> {

}
