package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AnimalEntity;
import com.example.demo.repository.AnimalRepo;

@Service
public class AnimalService {

	private AnimalRepo animalRepo;
	/*
	 * List<AnimalEntity> findByName(String name); List<AnimalEntity> findAll();
	 * AnimalEntity findOne(Long id); AnimalEntity save(String name); AnimalEntity
	 * update(String name, Long id); AnimalEntity delete(Long id);
	 */

	public AnimalService(@Autowired AnimalRepo animalRepo) {
		this.animalRepo = animalRepo;
	}

	public String saveAnimal(AnimalEntity name) {
		animalRepo.save(name);
		return "Created new animal: " + name;
	}

	public void findlById(Long id) {
		animalRepo.findById(id);
	}

	public List<AnimalEntity> getAnimals() {
		return animalRepo.findAll();
	}

	public void setAnimalRepo(AnimalRepo animalRepo) {
		this.animalRepo = animalRepo;
	}

	public void deleteAnimalById(Long id) {
		this.animalRepo.deleteById(id);
	}

	public void updateAnimal(Long id, AnimalEntity newData) {
		Optional<AnimalEntity> animal = this.animalRepo.findById(id);
		if (animal.isPresent()) {
			if (!newData.getName().isEmpty()) {
				animal.get().setName(newData.getName());
			}
			this.animalRepo.save(animal.get());
		}
	}
}
