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


    }
}
