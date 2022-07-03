package compass.homework_3_1spring.controllers;

import compass.homework_3_1spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/order")
public class ItemsController {

    private final OrderService orderService;

    public ItemsController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids){
        return orderService.addItems(ids);
    }
    @GetMapping("/get")
    public List<Integer> getItems(){
        return orderService.getItems();
    }
}