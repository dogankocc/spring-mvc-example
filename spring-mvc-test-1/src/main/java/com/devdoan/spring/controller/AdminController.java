package com.devdoan.spring.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.devdoan.spring.model.User;
@Controller
public class AdminController {
private Map<String, User> userMap = new HashMap<>();
 
 @RequestMapping(value = {
		 "/admin",
 })
 public String admin() {
	 
	 return "admin";
 }
 
 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
 public String addUser(@ModelAttribute("user") User user,BindingResult result, ModelMap model) {
	 if (result.hasErrors()) {
         return "error";
     }
	 model.addAttribute("name", user.getUserName());
     userMap.put(user.getUserName(), user);
     
	 return "admin";
 }
}
