package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carsList = new ArrayList<>();

    public CarService() {
        carsList.add(new Car(1, "audi", "wagon"));
        carsList.add(new Car(2, "bmw", "cabrio"));
        carsList.add(new Car(3, "volkswagen", "SUV"));
        carsList.add(new Car(4, "skoda", "sedan"));
        carsList.add(new Car(5, "mercedes", "coupe"));
    }

    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCars(@RequestParam(value = "count", required = false) Integer count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
