package com.ahelord.interfaces;

public class Hamster implements Pet,Domestic,Comparable<Animal>,Cloneable,Adoption<Hamster>{

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

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.toString());
    }

    @Override
    public boolean canBeAdopted(Hamster animal) {
        return canLiveInRoom();
    }
}
