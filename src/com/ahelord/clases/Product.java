package com.ahelord.clases;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Period;

public class Product implements Comparable<Product>{



    // constante compartida
    private String name;
    private int amount;
    public static int countCreations = 0;
    public static final double IVA = 0.16;
    //    private static Period defaultExpiryPeriod = Period.ofDays(3);
    private static Period defaultExpiryPeriod;
    private BigDecimal price;
    private ProductStatus productStatus;
 
	private LocalDateTime bestBefore;

	// se puede inicializar con constructores o con inicializadores de instancia
    {countCreations= ++countCreations;}

    static {
        defaultExpiryPeriod = Period.ofDays(3);
    }
    
    

	public Product(String name, int amount, BigDecimal price, ProductStatus productStatus, LocalDateTime bestBefore) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.productStatus = productStatus;
		this.bestBefore = bestBefore;
	}
	
    public Product(String name, int amount, BigDecimal price, LocalDateTime bestBefore) {
		this(name,amount,price,ProductStatus.NEW,bestBefore);
	}
    



    // Se agrega por defecto un constructor si parametros a menos de que no exista otro constructor
    // Podria tener este constructor si desea crear una clase con constructor o sin constructor
    
    public Product(){
        this("no name",0,BigDecimal.valueOf(0.0),LocalDateTime.now());
    }
    public Product(int amount,String name){
        this(name);
        this.amount = amount;
    }

    public Product(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(final LocalDateTime bestBefore) {
        this.bestBefore = bestBefore;
    }

    public ProductStatus getProductStatus() {
 		return productStatus;
 	}
    
    public void setPrice(double price){
        this.price = BigDecimal.valueOf(price);
    }
    
    
    public BigDecimal getDiscount(final BigDecimal discount) {
        // los metodos estaticos no pertenecen a ninguna instancia

        return price.multiply(discount);
    }


    // los metodos y variables  estaticos no pertenecen a ninguna instancia
    // comparten todas las instancias podrian ser nmetodos por defecto que no dependan del objeto por
    // static es algo comun para los objetos es parecido a una constante que puede cambiar
    // ejemplo calcular la velocidad de un objeto teniendo en cuanta su propia masa
    public static Period setDefaultExpiryPeriod(final int days) {
        // no puedo acceder a una variable o metodo de instancia
        // this
        defaultExpiryPeriod = Period.ofDays(days);
        return defaultExpiryPeriod;
    }
 
    public void printVarArg (String first,String... myStrings){
        System.out.println(first+myStrings[0]+myStrings[1]);
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
