package com.williamgu.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.williamgu.mongodb.springbootmongodbexample.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
