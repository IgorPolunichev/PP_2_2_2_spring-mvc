package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String showCars (@RequestParam (value = "count", required = false) Integer count, ModelMap model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VAZ" , 2101, "passenger car"));
        cars.add(new Car("UAZ" , 3303, "cargo car"));
        cars.add(new Car("BMV" , 5, "passenger car"));
        cars.add(new Car("Hyundai" , 100, "cargo car"));
        cars.add(new Car("ZAZ" , 1101, "passenger car"));
        if (count == null || count >= cars.size()){
            model.addAttribute("cars" , cars);
        } else if (count > 0){
            model.addAttribute("cars", cars.stream().limit(count).toList());
        }
        return "Cars";
    }

}
