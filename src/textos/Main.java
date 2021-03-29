package textos;

public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Wolrd";
        System.out.println( a+="sdasd");
        System.out.println(a.concat(b));
        // la sentencia substring el primer indice es inclusivo quiere decir que toma esa leta
        // el segundo es exclusivo , se tomas las primeras 5 posiciones
        String sub = (a+b).substring(0,5);
        System.out.println(sub);
        System.out.println(sub.charAt(0));

       StringBuilder sb = new StringBuilder("hola");
        System.out.println(sb);
        sb.append("1");
        sb.insert(0,"2");
        sb.delete(0,1);
        sb.reverse();
        System.out.println(sb);
        // String Builder ampliara segun sea necesario si pasa la capacidad se apliara
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1==s2);//false because reference variables are pointing to different instance
        System.out.println(s2==s3);//true because reference variables are pointing to same instance

        // last cacharacter
        char lastCharacter = s2.charAt(s2.length()-1);
        System.out.println(lastCharacter);


    }
}
