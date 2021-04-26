package com.teatime.full.dao;

import java.util.List;

import com.teatime.full.entity.Tea;

public interface TeaDAO {

	public List<Tea> getTea();

	public void saveTea(Tea theTea);

	public Tea getTea(int theId);

	public void deleteTea(int theId);
}
