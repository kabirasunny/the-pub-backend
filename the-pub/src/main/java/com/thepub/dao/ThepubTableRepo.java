package com.thepub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thepub.models.ThepubTable;
import java.util.List;


@Repository
public interface ThepubTableRepo extends CrudRepository<ThepubTable, Integer> {

	public Iterable<ThepubTable> findByNumber(long number);
}
