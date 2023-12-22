package com.won15367.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.won15367.board.command.BWriteCommand;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		return "write_form";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		BWriteCommand command = new BWriteCommand();
		
		command.excute(model);
		
		return "list";
	}
	
}

