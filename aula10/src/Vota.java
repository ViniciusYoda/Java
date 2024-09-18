import java.util.Scanner;

public class Vota {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = tec.nextInt();
        int ano = 2024;
        int idade = ano - nasc;
        if (idade < 16) {
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        } 
    }
}