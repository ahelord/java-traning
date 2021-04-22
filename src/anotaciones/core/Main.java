package anotaciones.core;

import com.ahelord.anotaciones.BusinessPolicies;
import com.ahelord.anotaciones.BusinessPolicy;

@BusinessPolicies(contractDate = "2021-12-21", policies = {
        @BusinessPolicy(name = "current")
})
public class Main {
    public static void main(String[] args) {

    }
}
