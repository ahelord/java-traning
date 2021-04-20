package com.ahelord.examen;

// line n1

 interface Pet {
    public abstract int breed();
    // line n2
    public default Pet callPet(){
        return this;
    }
    // line n3
    void speak();
}