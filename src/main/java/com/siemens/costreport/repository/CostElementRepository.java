package com.siemens.costreport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siemens.costreport.model.CostElement;

public interface CostElementRepository extends JpaRepository<CostElement, Integer>{

}
