package com.niiodm.itemtracker.data.repository;

import com.niiodm.itemtracker.data.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
