package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Numero;


public interface NumeroRepository extends JpaRepository<Numero, Integer> {

}
