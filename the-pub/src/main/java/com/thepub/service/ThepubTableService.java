package com.thepub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepub.dao.ThepubTableRepo;
import com.thepub.models.ThepubTable;

@Service
public class ThepubTableService {

	@Autowired
	private ThepubTableRepo repository;
	
	public ThepubTable saveTable(ThepubTable table) {
		return this.repository.save(table);
	}
	
	public Iterable<ThepubTable> getTable(){
		return this.repository.findAll();
	}
}
