package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopSupplier1 implements Supplier {
    private Order order;

    public ExtraFoodShopSupplier1(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "ExtraFoodShopSupplier1{" +
                "order= " + order +
                '}';
    }

    @Override
    public boolean process() {

        return true;
    }
}