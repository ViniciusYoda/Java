import java.util.Scanner;

public class Passo {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escreva o início da repetição: ");
        int i = tec.nextInt();
        System.out.println("Escreva o fim da repetição: ");
        int f = tec.nextInt();
        System.out.println("Escreva o passo da repetição: ");
        int p = tec.nextInt();
        for(int c = i; c <= f; c+=p) {
            System.out.println(c);
        }

    }
}