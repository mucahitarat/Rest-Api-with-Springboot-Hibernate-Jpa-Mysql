package com.javacourse.proect.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.proect.hibernateAndJpa.Entities.Country;;

public interface ICountryDal {
	List<Country> getAll();
	void add(Country country);
	void update(Country country);
	void delete(Country country);
	Country getById(int id);
}
