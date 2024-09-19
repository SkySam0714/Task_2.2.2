package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<Car> cars = new ArrayList<>(5);
    public UserService(){
        cars.add(new Car("BMW", "blue", "AL759LH"));
        cars.add(new Car("BMW", "black", "AN000LH"));
        cars.add(new Car("Mercedes", "white", "AM111LH"));
        cars.add(new Car("Porsche", "red", "AF666LH"));
        cars.add(new Car("Lamborghini", "yellow", "OM777GH"));
    }

    public List<Car> getCars(Integer count){
        if(count == null || count > cars.size()) {
            count = cars.size();
        }
        return cars.subList(0,count);
    }
}
