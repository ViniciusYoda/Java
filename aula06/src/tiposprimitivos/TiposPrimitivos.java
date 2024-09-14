package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nora do aluno");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é é %.2f \n", nome, nota);
        System.out.format("A nota de %s é é %.2f \n", nome, nota);
    }
}