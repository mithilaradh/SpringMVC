package com.mithila.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginClass {

	@RequestMapping(value = "/login")
	public String loginPage(@RequestParam("username") String username, @RequestParam("password") String password) {
		if (username.equals("mithila") && password.equals("123"))
			return "login Successful";

		return "login denied";
	}
}
