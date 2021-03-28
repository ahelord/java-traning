package com.ahelord.fechasytiempo;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime thisTime = LocalTime.now();
        System.out.println(thisTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        LocalDate someDay = LocalDate.of(2019, Month.APRIL,1);
        System.out.println(someDay);
        LocalTime someTime = LocalTime.of(10,6);
        System.out.println(someTime);
        LocalDateTime someDateTime = someDay.atTime(someTime);
        System.out.println(someDateTime);
        LocalDate whatWasTheDate = someDateTime.toLocalDate();
        System.out.println(whatWasTheDate);
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        LocalDateTime different = current.withMinute(14).withDayOfMonth(3).plusHours(12);
        System.out.println(different);
        boolean isBefore = current.isBefore(different);
        System.out.println(isBefore);
        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);
        int nanoSecond = timeStamp.getNano();
        System.out.println(nanoSecond);
        LocalDate tomorrow = today.plusDays(12);
        Period howLong = Period.between(tomorrow,today);
        System.out.println(howLong);
        Duration twoHours = Duration.ofHours(2);
        System.out.println(twoHours);

    }
}
