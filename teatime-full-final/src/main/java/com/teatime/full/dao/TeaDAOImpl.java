package com.teatime.full.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teatime.full.entity.Tea;

@Repository
public class TeaDAOImpl implements TeaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tea> getTea() {
		
		Session currentSession =sessionFactory.getCurrentSession();
		
		Query<Tea> theQuery = currentSession.createQuery("from Tea order by teaName", Tea.class); 
		List<Tea> teas= theQuery.getResultList();
		
		return teas;
	}

	@Override
	public void saveTea(Tea theTea) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theTea);
		
	}

	@Override
	public Tea getTea(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Tea theTea =  currentSession.get(Tea.class, theId);
		
		return theTea;
	}

	@Override
	public void deleteTea(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Tea where id=:teaId");
		theQuery.setParameter("teaId", theId);
		theQuery.executeUpdate();
		
	}

}
