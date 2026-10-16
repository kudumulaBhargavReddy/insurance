package com.magtGlobal.insurence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magtGlobal.insurence.entity.InsurancePolicy;

@Repository
public interface PolicyRepository extends JpaRepository<InsurancePolicy, Long> {
    
}