package com.desafios.desafio1.entities;

public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Order() {
    }

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code=" + getCode() +
                ", basic=" + getBasic() +
                ", discount=" + getDiscount() +
                '}';
    }
}
