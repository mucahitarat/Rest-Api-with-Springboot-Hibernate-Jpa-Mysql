package com.javacourse.proect.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.proect.hibernateAndJpa.DataAccess.*;
import com.javacourse.proect.hibernateAndJpa.Entities.Country;

@Service
public class CountryManager implements ICountryService {

	private ICountryDal cityDal;	
	
	@Autowired
	public CountryManager(ICountryDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<Country> getAll() {
		
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(Country country) {
		//business
		this.cityDal.add(country);
		
	}

	@Override
	@Transactional
	public void update(Country country) {
		this.cityDal.update(country);
		
	}

	@Override
	@Transactional
	public void delete(Country country) {
		this.cityDal.delete(country);
		
	}

	@Override
	@Transactional
	public Country getById(int id) {
		return this.cityDal.getById(id);
	}

	

}
