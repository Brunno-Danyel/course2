package com.brunnodanyel.course2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunnodanyel.course2.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>{

}
