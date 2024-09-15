import java.lang.Math;

public class OperadoresAritmeticos {
    public static void main(String[] args) throws Exception {
       float n1 = 3;
       float n2 = 5;
       float m = (n1 + n2) / 2;
       System.out.println("A média é igual a " + m);

       int numero = 5;
       int valor = 5 + ++numero;
       System.out.println(valor);
       double pi = Math.PI;
       double exponenciacao = Math.pow(5,2);
       double raizQ = Math.sqrt(25);
       double raizC = Math.cbrt(27);
       System.out.println(pi);
       System.out.println(exponenciacao);
       System.out.println(raizQ);
       System.out.println(raizC);
       double absoluto = Math.abs(-10);
       double flo = Math.floor(3.9);
       double cei = Math.ceil(4.2);
       double rou = Math.round(5.6);
       System.out.println(absoluto);
       System.out.println(flo);
       System.out.println(cei);
       System.out.println(rou);
    }
}
