package com.niiodm.itemtracker.data.repository;

import com.niiodm.itemtracker.data.model.Handler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandlerRepository extends JpaRepository<Handler, Long> {
}
