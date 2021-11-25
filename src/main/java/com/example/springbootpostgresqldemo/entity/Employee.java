package com.example.springbootpostgresqldemo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employees")

@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}

