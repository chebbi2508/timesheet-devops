package tn.esprit.spring.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	IUserService us;
/*
	@Order(1)
	@Test
	public void testReieveAllUsers() {
		
		List<User>  ListUsers =  us.retrieveAllUsers();
		Assertions.assertEquals(1, ListUsers.size());
	}
	*/
	/*
	@Test
	public void testAddUser() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d=format.parse("2021-19-21");
		User u = new User(5L,"aaa","fff",d,Role.CHEF_DEPARTEMENT);
		User userAdded = us.addUser(u);
		Assertions.assertEquals(u.getLastName(),userAdded.getLastName());
	}
	*/
	/*
	@Test
	public void testUpdateUser() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d=format.parse("2020-11-21");
		User u = new User(5L,"modifier","lastnamemodifier",d,Role.TECHNICIEN);
		User userAdded = us.addUser(u);
		Assertions.assertEquals(u.getLastName(),userAdded.getLastName());
		}
	*/
	
	/*
	@Test
	public void testDeleteUser() {
		us.deleteUser("5");
		Assertions.assertNull(us.retrieveUser("5"));
		}
	*/

}
