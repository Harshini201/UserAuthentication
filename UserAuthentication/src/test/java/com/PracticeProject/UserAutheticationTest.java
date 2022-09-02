package com.PracticeProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserAutheticationTest {
        private UserAuthetication user;
	@BeforeEach
	 public  void check() {
		 user=new UserAuthetication();
		 System.out.println(" Object Intialized");
	}
	@Test
	public void verifyusername() {
		assertEquals( user.getUserName(),"Harshini");
	}
	@Test
	public void verifyEmail() {
		assertEquals( user.getEmail(),"harshini@gmail.com");
	}
	@Test
	public void verifyPhoneNum() {
		assertEquals( user.getPhoneNum(),1234567490);
	}
	@Test
	public void verifyPassword() {
		assertEquals( user.getPassword(),"H@123");
	}
	@AfterEach
	public   void tearDown() {
		user=null;
		System.out.println("Object destroyed");
	}


}
