package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entities.TODO;

@Controller
public class ControllerClass {

	@RequestMapping("/home")
	public String home(Model m) {
		String str = "home";
		m.addAttribute("page", str);
		return "home";
	}
	
	
	@RequestMapping("/add")
	public String addTodo(Model m) {
		TODO t = new TODO();
		m.addAttribute("page","add");
		m.addAttribute("todo",t);
		return "home";
	}
	
	@PostMapping("/saveTodo")
	public String saveTodo(@ModelAttribute ("todo") TODO t,Model m)
	{
		t.setTodoDate(new Date());   
		System.out.println(t);
		return "home";
	}
}
