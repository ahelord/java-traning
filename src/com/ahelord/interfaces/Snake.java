package com.ahelord.interfaces;

public class Snake implements Pet,Wild{
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
        return "sssssssisssss";
    }

    @Override
    public boolean attackHumnas() {
        return false;
    }

    @Override
    public String getGroup() {
        return "reptile";
    }
}
