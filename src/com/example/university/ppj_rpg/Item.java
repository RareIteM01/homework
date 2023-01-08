package com.example.university.ppj_rpg;

public class Item {
    private int value;
    private ItemType type;

    public Item(int value, ItemType type){
        this.type = type;
        this.value = value;
    }
    public int increase(int count){
        value += count;
        return value;
    }
    public int decrease(int count){
        value -= count;
        return value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ItemType getType(){
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
