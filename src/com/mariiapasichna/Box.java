package com.mariiapasichna;

public class Box {
    private double weight;
    private double price;
    private double pricePerWeight;

    public Box(double weight, double price, double pricePerWeight) {
        this.weight = weight;
        this.price = price;
        this.pricePerWeight = pricePerWeight;
    }

    public double getPricePerWeight() {
        return pricePerWeight;
    }


    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", price=" + price +
                ", PricePerWeight=" + pricePerWeight +
                '}';
    }
}