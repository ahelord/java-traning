package com.ahelord.interfaces;

public class Hamster implements Pet,Domestic{

    private String name;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getOnomatopoeia() {
        return "";
    }

    @Override
    public boolean canLiveInRoom() {
        return true;
    }

    @Override
    public String getGroup() {
        return "mammals";
    }
}
