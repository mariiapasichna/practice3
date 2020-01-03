package com.mariiapasichna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static final double MAX_WEIGHT = 15;

	public static void main(String[] args) {
		List<Box> boxes = new ArrayList<>();
		Backpack backpack = new Backpack();

		Box box1 = new Box(12, 4, 4.0 / 12.0);
		Box box2 = new Box(1, 2, 2.0 / 1.0);
        Box box3 = new Box(4, 10, 10.0 / 4.0);
        Box box4 = new Box(1, 1, 1.0 / 1.0);
        Box box5 = new Box(2, 2, 2.0 / 2.0);

        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
        //System.out.println(boxes);

        boxes.sort(new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return (int) (b1.getPricePerWeight() - (b2.getPricePerWeight()));
            }
        });
        //System.out.println(boxes);

        double weight = 0;
        double price = 0;
        for (int i = boxes.size() - 1; i >= 0; i--) {
            weight += boxes.get(i).getWeight();
            price += boxes.get(i).getPrice();
            backpack.addBox(boxes.get(i));
            while (weight > MAX_WEIGHT) {
                weight -= boxes.get(i).getWeight();
                price -= boxes.get(i).getPrice();
                backpack.removeBox(boxes.get(i));
            }
        }
        System.out.println("Optimal backpack equipment: weight - " + weight + ", price - " + price);
        System.out.println(backpack.getBackpack());
    }
}