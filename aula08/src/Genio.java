import java.util.Scanner;

public class Genio {
    public static void main(String[] args) throws Exception {
        System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar");
        double n = 1 + Math.random() * (6-1);
        int valor = (int) n;
        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        String f1 = "Acertou";
        String f2 = "Errou eu pensei no valor " + valor;
        String res = (valor == num) ? f1 : f2;
        System.out.println(res);

    }
}
