package com.ghartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghartur.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
