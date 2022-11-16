package com.example.pagination.services;

import com.example.pagination.dtos.CarResponse;
import com.example.pagination.entity.Car;
import com.example.pagination.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarResponse> getCars(Pageable pageable) {
        Page<Car> cars = carRepository.findAll(pageable);
        List<CarResponse> response  = cars.stream().map(car -> new CarResponse(car)) //alle lister fremad java 8, har stream
                .collect(Collectors.toList());
        return response;
    }
}
