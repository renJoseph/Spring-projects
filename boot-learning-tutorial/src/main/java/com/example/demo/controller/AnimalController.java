package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AnimalEntity;
import com.example.demo.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
	private AnimalService animalService;
	
	public AnimalController(@Autowired AnimalService animalService) {
		this.animalService = animalService;
	}
	
	@GetMapping("/hello2")
	public String helloWorld2(@RequestParam("Some param") String thatParam) {
		return "hello, world!";
	}
	
	@PostMapping("/post")
		public void createNewAnimal(@RequestBody AnimalEntity animal) {
		this.animalService.saveAnimal(animal);
	}

	@DeleteMapping("/delete")
	public void deleteAnimal(@RequestParam String id) {
		
	}
	
	@PostMapping("/update")
	public void updateAnimal() {
		
	}
}
