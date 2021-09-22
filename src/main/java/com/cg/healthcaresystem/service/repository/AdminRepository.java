package com.cg.healthcaresystem.service.repository;

import com.cg.healthcaresystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin,Integer> {
}