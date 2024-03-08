package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.Service;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView addNum(@RequestParam("num1") int i, @RequestParam("num2") int j) {

		Service serv = new Service();
		int sum = serv.add(i, j); 

		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("sum", sum);

		return mv;
	}
}
