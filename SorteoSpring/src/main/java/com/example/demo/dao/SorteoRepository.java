package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Sorteo;

public interface SorteoRepository extends JpaRepository<Sorteo, Integer> {

}
