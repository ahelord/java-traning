package com.ahelord.clases;

public enum ProductStatus {
    NEW("IS NEW");

    public String getMessage() {
        return message;
    }

    private String message;
    private ProductStatus(String message){
        this.message=message;
    }
}
