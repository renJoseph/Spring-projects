package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AnimalEntity;

@Repository
public interface AnimalRepo extends JpaRepository<AnimalEntity, Long>{
	List<AnimalEntity> findByName(String name);
	List<AnimalEntity> findAll();
	Optional<AnimalEntity> findById(Long id);
	AnimalEntity save(String name);
	AnimalEntity update(String name, Long id);
	AnimalEntity delete(Long id);
	
}
