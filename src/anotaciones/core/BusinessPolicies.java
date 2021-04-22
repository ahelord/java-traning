package anotaciones.core;

import com.ahelord.anotaciones.BusinessPolicy;

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
