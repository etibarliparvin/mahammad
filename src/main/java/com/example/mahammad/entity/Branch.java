package com.example.mahammad.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "branches")
@Data
//@EqualsAndHashCode(callSuper = false)
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String manager;
    private Integer employeeCount;

    @ManyToOne
//    @ToString.Exclude
    private Market market;
}
