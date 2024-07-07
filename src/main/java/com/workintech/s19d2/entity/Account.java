package com.workintech.s19d2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "account", schema = "sdemo")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
}
