package com.example.pagination.dtos;

import com.example.pagination.entity.Car;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) //den inkludere KUN det der ikke er null.
public class CarResponse {
    int id;
    String brand;
    String model;
    String color;
    int kilometers;

    public CarResponse(Car carEntity) {
        this.id = carEntity.getId();
        this.brand = carEntity.getBrand();
        this.model = carEntity.getModel();
        this.color = carEntity.getColor();
        this.kilometers = carEntity.getKilometers();

    }

}
