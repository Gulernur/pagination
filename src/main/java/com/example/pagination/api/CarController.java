package com.example.pagination.api;

import com.example.pagination.dtos.CarResponse;
import com.example.pagination.services.CarService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarResponse> getCarsPageable(Pageable pageable) { //dependency injection
        System.out.println(pageable.getPageNumber() + "," + pageable.getPageSize() + "," + pageable.getSort());
        return carService.getCars(pageable);
    }
}
