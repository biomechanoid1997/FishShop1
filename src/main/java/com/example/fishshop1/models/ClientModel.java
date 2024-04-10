package com.example.fishshop1.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "wanted_item")
    String item;

    @Column(name = "contact")
    String contact;

    @Column(name = "actual")
    Boolean actual;
}
