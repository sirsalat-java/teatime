package com.teatime.full.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teatime.full.dao.TeaDAO;
import com.teatime.full.entity.Tea;

@Service
public class TeaServiceImpl implements TeaService {

	@Autowired
	private TeaDAO teaDAO;
	
	
	@Override
	@Transactional
	public List<Tea> getTea() {
	return teaDAO.getTea();
	}


	@Override
	@Transactional
	public void saveTea(Tea theTea) {
		
		teaDAO.saveTea(theTea);
		
	}


	@Override
	@Transactional
	public Tea getTea(int theId) {
		
		return teaDAO.getTea(theId);
	}


	@Override
	@Transactional
	public void deleteTea(int theId) {
		
		teaDAO.deleteTea(theId);
		
	}

}
