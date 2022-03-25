package web.service;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static <T> List<T> getSubList(List<T> list, int count) {
        return list.stream().limit(count > 0 ? Math.min(count, 5) : 5).collect(Collectors.toList());
    }
}
