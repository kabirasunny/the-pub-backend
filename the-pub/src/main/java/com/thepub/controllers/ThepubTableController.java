package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubTable;
import com.thepub.service.ThepubTableService;

@RestController
public class ThepubTableController {

	@Autowired
	private ThepubTableService service;
	
	@PostMapping("/table")
	public String saveTable(@RequestBody ThepubTable table) {
		this.service.saveTable(table);
		return "Data successfully submit";
	}
}
