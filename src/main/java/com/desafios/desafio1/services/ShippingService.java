package com.desafios.desafio1.services;

import com.desafios.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final Double RANGE1 = 100D;
    private final Double RANGE2 = 200D;
    private final Double VALUE1 = 20D;
    private final Double VALUE2 = 12D;

    public Double shipment(Order order) {
        if (order.getBasic() < RANGE1)
            return VALUE1;
        else if (order.getBasic() >= RANGE1 && order.getBasic() < RANGE2) {
            return VALUE2;
        }
        return 0D;
    }
}
