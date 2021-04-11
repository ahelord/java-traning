package com.ahelord.interfaces;

@FunctionalInterface
public interface Adoption <T>{
boolean canBeAdopted(T animal);
}
