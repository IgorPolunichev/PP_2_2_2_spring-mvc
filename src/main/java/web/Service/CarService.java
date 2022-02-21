package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getListCar (){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VAZ" , 2101, "passenger car"));
        cars.add(new Car("UAZ" , 3303, "cargo car"));
        cars.add(new Car("BMV" , 5, "passenger car"));
        cars.add(new Car("Hyundai" , 100, "cargo car"));
        cars.add(new Car("ZAZ" , 1101, "passenger car"));
        return cars;
    }
}
