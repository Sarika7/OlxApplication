package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.AdvertiseCategory;



public interface CategoryRepository extends JpaRepository<AdvertiseCategory, Long> {

}