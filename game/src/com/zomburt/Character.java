package com.zomburt;

import java.util.ArrayList;

public class Character {
    String name;
    int health;
    ArrayList<String> inventory = new ArrayList<String>();
    public Character(){

    };

    public Character(String name) {
        setName(name);
        setHealth(50);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void addInventory(String item) {
        this.inventory.add(item);
    }

    public void removeInventory(String item) {
        this.inventory.remove(item);
    }

    @Override
    public String toString() {
        return "com.zomburt.Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", inventory=" + inventory +
                '}';
    }
}
