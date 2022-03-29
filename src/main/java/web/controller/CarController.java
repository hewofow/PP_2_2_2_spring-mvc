package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("LADA", "7171271", 1.8F));
        cars.add(new Car("Renault", "d12iod123e", 2.0F));
        cars.add(new Car("Chevrolet", "12ei12e", 2.2F));
        cars.add(new Car("Tesla", "12431231231sfsfsf312e", 3.5F));
        cars.add(new Car("Volkswagen", "0923523jug9", 2.3F));
    }

    @GetMapping("/cars")
    public String showCarsList(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getSubList(cars, count));
        return "cars";
    }
}
