package com.niiodm.itemtracker.data.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Item {
    @Id
    private Long id;
    private String name;
}
