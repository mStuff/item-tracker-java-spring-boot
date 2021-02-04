package com.niiodm.itemtracker.data.repository;

import com.niiodm.itemtracker.data.model.Handling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandlingRepository extends JpaRepository<Handling, Long> {
}
