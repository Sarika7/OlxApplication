package com.zensar.olxadvertise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.Advertise;



public interface OlxAdvertiseRepository extends JpaRepository<Advertise, Long> {

}