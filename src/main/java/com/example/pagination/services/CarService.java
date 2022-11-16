package com.example.pagination.services;

import com.example.pagination.dtos.CarResponse;
import com.example.pagination.entity.Car;
import com.example.pagination.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarResponse> getCars() {
        List<Car> cars = carRepository.findAll();
        List<CarResponse> response  = cars.stream().map(car -> new CarResponse(car)) //alle lister fremad java 8, har stream
                .collect(Collectors.toList());
        return response;
    }
}
