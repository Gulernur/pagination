package com.example.pagination.repository;

import com.example.pagination.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {

    List<Car> findCarByBrand(String brand);
    List<Car> findCarByColor(String color);
}

/*public interface CarRepository extends PagingAndSortingRepository{}*/
