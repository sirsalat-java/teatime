package com.teatime.full.service;

import java.util.List;

import com.teatime.full.entity.Tea;

public interface TeaService {

	public List<Tea> getTea();

	public void saveTea(Tea theTea);

	public Tea getTea(int theId);

	public void deleteTea(int theId);

	
}
