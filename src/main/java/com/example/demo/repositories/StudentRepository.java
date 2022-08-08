package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends MongoRepository<Student , Long>{
	

}
