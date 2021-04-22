package com.ahelord.anotaciones;

import java.lang.annotation.*;
import java.time.LocalDateTime;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface BusinessPolicies {
    String name() default "Contract";
    String contractDate();
    BusinessPolicy[] policies();



}
