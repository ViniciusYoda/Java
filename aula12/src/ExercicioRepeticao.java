import java.util.Scanner;

public class ExercicioRepeticao {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        int n, s = 0, c = 0;
        int par = 0, impar = 0;
        int cem = 0;
        
        do {
            System.out.println("Informe um número: ");
            n = tec.nextInt();
            if (n != 0) {
                s += n; 
                c++;    

                if (n % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                if (n >= 100) {
                    cem++;
                }
            }
        } while (n != 0); 

        double media = (c > 0) ? (double) s / c : 0;

        System.out.println("A soma dos números: " + s);
        System.out.println("Total de valores inseridos: " + c);
        System.out.println("Total de pares: " + par);
        System.out.println("Total de ímpares: " + impar);
        System.out.println("Total de números >= 100: " + cem);
        System.out.println("Média dos valores: " + media);

        tec.close();
    }
}
