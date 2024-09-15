import java.util.Scanner;

public class Operadores{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numerador: ");
        float numerador = teclado.nextFloat();
        System.out.println("Digite o denominador: ");
        float denominador = teclado.nextFloat();
        float divisao = numerador / denominador;
        float resto = numerador % denominador;
        System.out.printf("A divisão é igual a %.1f \n", divisao);
        System.out.printf("O ressto da divisão é igual a %.1f", resto);
    }
}
