package com.HostelManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

 @GetMapping("/login")
 public String showLoginForm() {
     return "login";
 }

 @PostMapping("/login")
 public String processLogin() {
     
	 return "redirect:/beds";
 }
}
