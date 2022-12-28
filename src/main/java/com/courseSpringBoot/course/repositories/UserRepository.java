package com.courseSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseSpringBoot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
