package org.aptech.t2109e.springdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;


@Entity(name = "employees")
@NoArgsConstructor
@SuperBuilder
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "wage", nullable = false)
    private long wage;
}
