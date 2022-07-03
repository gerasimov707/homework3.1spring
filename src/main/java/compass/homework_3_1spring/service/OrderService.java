package compass.homework_3_1spring.service;

import java.util.List;

public interface OrderService {
    List<Integer>addItems(List<Integer>idList);
    List<Integer> getItems();
}
