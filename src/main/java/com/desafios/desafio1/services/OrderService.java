package com.desafios.desafio1.services;

import com.desafios.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {
        return order.getBasic() - discount(order) + shippingService.shipment(order);
    }

    public Double discount(Order order) {
        return order.getBasic() * order.getDiscount() / 100;
    }


}
