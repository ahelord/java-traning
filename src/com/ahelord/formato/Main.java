package com.ahelord.formato;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(2.99);
        Double tax = 0.2345345;
        int quantity = 123545;
        Locale locale = new Locale("es","CO");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentegeFormat = NumberFormat.getPercentInstance(locale);
        percentegeFormat.setMaximumFractionDigits(2);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        String formattedPrice = currencyFormat.format(price);
        System.out.println(formattedPrice);
        System.out.println(percentegeFormat.format(tax));
        System.out.println(numberFormat.format(quantity));

       // Double newTax = (Double) percentegeFormat.parse("20 %");
        //System.out.println(newTax);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy",locale);

        LocalDate date = LocalDate.of(2019, Month.APRIL,21);
        System.out.println(date.format(format));
        format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        System.out.println(date.format(format));

        ResourceBundle bundle = ResourceBundle.getBundle("com.ahelord.formato.messages",locale);
        String hello = bundle.getString("hello");
        System.out.println(hello);
        String name = "Cookie";
        String bestBefore = date.format(format);
        String priceFormat =  currencyFormat.format(price);
        String patternProduct = bundle.getString("product");
        System.out.println(MessageFormat.format(patternProduct,name,priceFormat,quantity,bestBefore));

    }
}
