package com.pantrychef.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.pantrychef.model.Component;
import com.pantrychef.model.Recipe;

@Service
public class ComponentService {

	public List<Component> findComponents(Recipe recipe){
		//TODO
		return null;
	}
	
	public List<UUID> findRecipes(List<UUID> components){
		//TODO
		return null;
	}
}
