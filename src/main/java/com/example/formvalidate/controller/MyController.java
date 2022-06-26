package com.example.formvalidate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.formvalidate.user.User;

@Controller
public class MyController implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}

	@GetMapping("/")
	public String showForm(User user, Model model) {
		model.addAttribute("user", new User());
		return "form";
	}

	@PostMapping(value = "/pr")
	public String submitForm(@Valid @ModelAttribute User user, BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}

		System.out.println(user);
		return "redirect:/results";

	}

}
