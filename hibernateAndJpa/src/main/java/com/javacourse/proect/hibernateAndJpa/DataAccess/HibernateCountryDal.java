package com.javacourse.proect.hibernateAndJpa.DataAccess;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.proect.hibernateAndJpa.Entities.Country;

@Repository
public class HibernateCountryDal implements ICountryDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	//AOP - Aspect Oriented Programming
	@Override
	@Transactional
	public List<Country> getAll() {		
		Session session = entityManager.unwrap(Session.class);
		List<Country> countries = session.createQuery("from Country",Country.class).getResultList();
		return countries;
	}

	@Override
	public void add(Country country) {
		//if()
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
	}

	@Override
	public void update(Country country) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	public void delete(Country country) {
		Session session = entityManager.unwrap(Session.class);
		Country cityToDelete = session.get(Country.class, country.getCode());
		session.delete(cityToDelete);
	}
	@Override
	public Country getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Country country = session.get(Country.class, id);
		return country;
	}

	

}
