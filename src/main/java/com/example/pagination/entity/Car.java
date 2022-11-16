package com.example.pagination.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Car {

    @Id
    int id;
    String brand;
    String model;
    String color;
    int kilometers;
}
