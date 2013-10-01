package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Design;
import com.satellite.domain.Model;

 interface DesignDao {
	
	
	void insertDesign(Model modelo) ;
	List<Design> getAllDesign();
	Model getDesign(Integer id);
	void deleteDesign(Integer id);
	List<Design> getDesignforModel(Integer model);
}
