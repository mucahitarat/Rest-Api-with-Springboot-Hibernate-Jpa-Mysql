package com.javacourse.proect.hibernateAndJpa.restApi;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.proect.hibernateAndJpa.Business.ICountryService;
import com.javacourse.proect.hibernateAndJpa.Entities.*;

@RestController
@RequestMapping("/api")
public class CountryController {
	
	private ICountryService countryService;

	@Autowired
	public CountryController(ICountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping("/countries")
	public List<Country> get(){
		return countryService.getAll();
	}
	
	
	  @PostMapping("/add") public void add(@RequestBody Country country) {
		  countryService.add(country); }
	 
	  @PostMapping("/update") public void update(@RequestBody Country country) {
		  countryService.update(country); }
	
	  @PostMapping("/delete") 
	  public void delete(@RequestBody Country country) {
		  countryService.delete(country); }
	  
	  @GetMapping("/countries/{id}")
	  public Country getById(@PathVariable int id){ 
		  return countryService.getById(id); }
	 
	
}
