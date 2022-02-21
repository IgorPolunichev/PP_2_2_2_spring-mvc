package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    public CarService carsService;

    @GetMapping(value = "/cars")
    public String showCars (@RequestParam (value = "count", required = false) Integer count, ModelMap model){
        List<Car> cars = carsService.getListCar();
        if (count == null || count >= cars.size()){
            model.addAttribute("cars" , cars);
        } else if (count > 0){
            model.addAttribute("cars", cars.stream().limit(count).toList());
        }
        return "Cars";
    }

}
