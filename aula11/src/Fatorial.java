import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o número entre 1 a 12: ");
        int c= tec.nextInt();
        tec.close();
        if (c > 0 && c < 13) {  
            int f = 1;
            while (c >= 1) {
                f *= c;  
                c--;     
            }
            System.out.println("O fatorial é: " + f);  
        } else {
            System.out.println("Número fora do intervalo permitido");
        }
    }
}
