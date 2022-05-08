package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.LoginUser;

public interface OlxLoginRepository extends JpaRepository<LoginUser, Long>{

}