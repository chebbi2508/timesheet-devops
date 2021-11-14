package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;


@Service
public class DepartementServiceImpl implements IDepartementService {

	@Autowired
	DepartementRepository departementRepository;
	
	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);

	@Override
	public List<Departement> retrieveAllDepartements() { 
		List<Departement> departements = null; 
		try {
			
			
			l.info("In method ggggg :"); 
			l.info("In method kkkkk :"); 
			l.info("In method retrieveAllDepartements :"); 
			departements = (List<Departement>) departementRepository.findAll();  
			l.debug("connexion à la DB Ok:");
			
			for (Departement departement : departements) {
				l.debug("Departement :" + departement.getName());
			} 
			l.info("Out of method retrieveAllDepartements with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllDepartements with Error :"+ e);
		}

		return departements;
	}

	@Override
	public Departement addDepartement(Departement d) {
		l.info("In method addDepartement :");
		Departement d_saved = departementRepository.save(d); 
		l.info("Out of method addDepartement with success");
		return d_saved; 
	}

	@Override 
	public Departement updateDepartement(Departement d) { 
		l.info("In method updateDepartement :");
		Departement d_saved = departementRepository.save(d); 
		l.info("Out of method updateDepartement with success");
		return d_saved; 
	}

	@Override
	public void deleteDepartement(String id) {
		l.info("In method deleteDepartement :");
		departementRepository.deleteById(Long.parseLong(id)); 
		l.info("Out of method deleteDepartement with success");
	}

	@Override
	public Departement retrieveDepartement(String id) {
		Departement dep = null;
		try{
		l.info("In method retrieveDepartement :");
		dep =  departementRepository.findById(Long.parseLong(id)).get(); 
		l.info("Out of method retrieveDepartement with success");
		}catch(Exception e){
			l.error("error in retrieveDepartement :  " +e);
		}
		return dep; 
	}


}
