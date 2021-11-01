package tn.esprit.spring.services;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			l.info("In method retrieveAllUsers :"); 
			users = (List<User>) userRepository.findAll();  
			l.debug("connexion à la DB Ok:");
			//int i =1/0;
			for (User user : users) {
				l.debug("user :" + user.getLastName());   
			} 
			l.info("Out of method retrieveAllUsers with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllUsers with Error :"+ e);
		}

		return users;
	}


	@Override
	public User addUser(User u) {
		l.info("In method addUser :"); 
		User u_saved = userRepository.save(u); 
		l.info("Out of method addUser with success");
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		l.info("In method updateUser :"); 
		User u_saved = userRepository.save(u); 
		l.info("Out of method updateUser with success");
		return u_saved; 
	}

	@Override
	public void deleteUser(String id) {
		l.info("In method deleteUser :"); 
		userRepository.deleteById(Long.parseLong(id)); 
		l.info("Out of method deleteUser with success");
	}

	@Override
	public User retrieveUser(String id) {
		User u = null;
		try{
			l.info("In method retrieveUser :"); 
			//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
			 u =  userRepository.findById(Long.parseLong(id)).get(); 
			l.info("Out of method retrieveUser with success");
		}catch(Exception e){
			l.error("error in retrieveUser :  " +e);
		}
	
		return u; 
	}

}
