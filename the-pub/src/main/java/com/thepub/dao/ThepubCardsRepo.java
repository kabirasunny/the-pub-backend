package com.thepub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubCards;

@Repository
public interface ThepubCardsRepo extends CrudRepository<ThepubCards, Integer>{

}
