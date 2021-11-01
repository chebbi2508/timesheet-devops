package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;


public interface IDepartementService {

	List<Departement> retrieveAllDepartements(); 
	Departement addDepartement(Departement d);
	void deleteDepartement(String id);
	Departement updateDepartement(Departement d);
	Departement retrieveDepartement(String id);
	
	
}
