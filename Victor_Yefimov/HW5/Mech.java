package com.company;
public abstract  class Mech{
    private int weight=0;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public abstract void move();


}
