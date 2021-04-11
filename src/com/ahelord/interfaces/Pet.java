package com.ahelord.interfaces;

import java.time.LocalDateTime;
import java.time.Month;

public interface Pet extends Animal {
    public static final LocalDateTime DATE_OF_REGISTER = LocalDateTime.of(2021, Month.OCTOBER,1,1,1);
    String getName();
     int getWeight();
     String getOnomatopoeia();

}
