package com.example.project.pharmacy.repository;

import com.example.project.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRespository extends JpaRepository<Pharmacy, Long> {
}
