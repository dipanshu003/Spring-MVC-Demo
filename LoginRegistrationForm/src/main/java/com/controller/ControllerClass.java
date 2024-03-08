package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.User;
import com.service.Dao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@Component
public class ControllerClass {

	@RequestMapping("/login")
	public String login(@RequestParam("email1") String email, @RequestParam("pass1") String pass,
			HttpServletRequest req, HttpServletResponse resp) throws IOException {

		RequestDispatcher rd;
		PrintWriter out = resp.getWriter();
		
		Dao dao = new Dao();
		User u = dao.getUser(email);
		if (u!= null) {

			if (u.getuPass().equals(pass)) {
				System.out.println("Login Successfull...");
				return "home.jsp";
			}

		}
		else {
			System.out.println("Login Failed...");
			return "login.jsp";
		}
		return "login.jsp";

	}

	@RequestMapping("/register")
	public String register(@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("pass1") String pass, @RequestParam("city1") String city) {

//		System.out.println(name + " " + email + " " + city + " " + pass);

		User u = new User(name, city, pass, email);

		Dao dao = new Dao();
		boolean isSave = dao.saveUser(u);
		System.out.println(isSave);

		return "login.jsp";
	}
}
