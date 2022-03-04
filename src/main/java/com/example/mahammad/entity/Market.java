package com.example.mahammad.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "market")
//@EqualsAndHashCode(callSuper = false)
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToOne(mappedBy = "market", cascade = CascadeType.ALL)
//    private Address address;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL)
    private Set<Branch> branches;
}
