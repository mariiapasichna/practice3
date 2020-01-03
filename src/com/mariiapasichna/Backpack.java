package com.mariiapasichna;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Box> backpack = new ArrayList<>();

    public void addBox(Box box) {
        backpack.add(box);
    }

    public void removeBox(Box box) {
        backpack.remove(box);
    }

    @Override
    public String toString() {
        return
                "backpack=" + backpack;
    }
}