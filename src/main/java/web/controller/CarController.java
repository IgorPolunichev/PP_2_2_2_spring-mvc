package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    public Service carsService;

    @GetMapping(value = "/cars")
    public String showCars (@RequestParam (value = "count", required = false) Integer count, ModelMap model){
        model.addAttribute("cars" , carsService.getList(count));
        return "Cars";
    }

}
