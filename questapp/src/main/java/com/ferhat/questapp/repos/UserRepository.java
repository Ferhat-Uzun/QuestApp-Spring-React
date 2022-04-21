package com.ferhat.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferhat.questapp.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
