import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) throws Exception {
        int n, s = 0;
        String resp;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = tec.nextInt();
            s += n;
            System.out.println("Quer continuar? (S/N)");
            resp = tec.next();
        } while (resp.equals('S'));
        System.out.println("A soma de todos os valores é igual a " + s);
    }
}