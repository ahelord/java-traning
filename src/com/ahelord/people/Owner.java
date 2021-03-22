package com.ahelord.people;
// es mejor importar solo las clases que necesita
import com.ahelord.animals.*;
public class Owner {
    Dogs myDog;
    // esta permitido pero es mas legible con la importacion
   com.ahelord.animals.Cats myCat;

   public void useCat(){
       // no se puede utilizar procrate por que es protegido solo se puede utilizar dentro del paquete
       //System.out.println(myCat.procreate());
   }
}
