package com.desafios.desafio1;

import com.desafios.desafio1.entities.Order;
import com.desafios.desafio1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    private final OrderService orderService;

    public Desafio1Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1034, 150D, 20D));
        orders.add(new Order(2282, 800D, 10D));
        orders.add(new Order(1309, 95.9D, 0D));
        orders.add(new Order(3333, 99.9D, 0D));
        orders.add(new Order(4444, 100D, 0D));
        orders.add(new Order(5555, 199.9D, 0D));
        orders.add(new Order(6666, 200D, 0D));

        for (Order order : orders) {
            System.out.println(order);
            System.out.println("Pedido código: " + order.getCode());
            System.out.println("Valor total: " + orderService.total(order).toString());
            System.out.println();
        }
    }
}

