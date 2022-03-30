package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public List<Car> getSubList(List<Car> list, int count) {
        return list.stream().limit(count > 0 ? Math.min(count, 5) : 5).collect(Collectors.toList());
    }
}
