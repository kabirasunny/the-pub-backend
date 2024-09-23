package com.thepub.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubCards;

@Repository
public interface ThepubCardsRepo extends CrudRepository<ThepubCards, Integer>{

	 @Query(value = "DELETE FROM thepub_cards WHERE title = :title", nativeQuery = true)
	public void deleteTitle(String title);
}
