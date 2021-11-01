package tn.esprit.spring.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
 import tn.esprit.spring.services.IDepartementService;

@SpringBootTest
public class DepartementServiceImplTest {
	@Autowired
	IDepartementService ds;
	
	
	/*
	  @Test
	//@Order(1)
	public void testReieveAllDepartements() {
		List<Departement>  ListDepartements =  ds.retrieveAllDepartements();
		Assertions.assertEquals(1, ListDepartements.size());
	} 
	
	*/
	/*
	@Test
	public void testAddDepartement() {
	
		Departement dep = new Departement("departementAdded");
		Departement depAdded = ds.addDepartement(dep);
		Assertions.assertEquals(dep.getName(),depAdded.getName());
	}
	*/
	
	/*
	@Test
	public void testUpdateDepartement() {
			Departement dep = new Departement(2,"departementAddedmodifier");
		Departement depAdded = ds.addDepartement(dep);
		Assertions.assertEquals(dep.getName(),depAdded.getName());
		}
	*/
	/*
	@Test
	public void testDeleteDepartement() {
			ds.deleteDepartement("2");
		Assertions.assertNull(ds.retrieveDepartement("2"));
		}
	
*/
}
