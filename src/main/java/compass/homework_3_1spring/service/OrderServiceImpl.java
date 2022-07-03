package compass.homework_3_1spring.service;

import compass.homework_3_1spring.component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
