package com.thepub.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubUser;

@Repository
public interface ThepubUserRepo extends CrudRepository<ThepubUser, Integer>{

	public ThepubUser findByNumber(long number);
	
	@Query("SELECT u FROM ThepubUser u WHERE u.number=:num")
	public long findNumber(long num);
}
