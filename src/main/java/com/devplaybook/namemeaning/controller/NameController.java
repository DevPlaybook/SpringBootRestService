package com.devplaybook.namemeaning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devplaybook.namemeaning.model.Name;

@RestController
public class NameController {
	@RequestMapping(value = "/nameMeaning", method = RequestMethod.GET)
	public Name nameMeaning(@RequestParam(value="name") String name) {
		Name n = new Name(name);
		if (name.equalsIgnoreCase("David")) {
			n.setGender("M");
			n.setMeaning("Beloved");
		}
		else if (name.equalsIgnoreCase("Amy")) {
			n.setGender("F");
			n.setMeaning("Beloved");
		}
		return n;
	}
}
