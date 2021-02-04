package com.niiodm.itemtracker.data.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Handling {
    @Id
    private Long id;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Handler handler;
    private LocalDateTime time;
}
