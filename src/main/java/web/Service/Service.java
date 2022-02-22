package web.Service;

import web.model.Car;

import java.util.List;

public interface Service {
    List<Car> getList (Integer countCar);
}
