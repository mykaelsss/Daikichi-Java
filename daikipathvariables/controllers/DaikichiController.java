package com.javastack.spring.daikipathvariables.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	public DaikichiController() {
		
	}
		@RequestMapping("")
		public String dai() {
			return "Welcome";
		}
		
		@RequestMapping("/today")
		public String daiT() {
			return "Today you will find luck in all your endeavors!";
		}
	
		@RequestMapping("/tomorrow")
		public String daiTT() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
}
