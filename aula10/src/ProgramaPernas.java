
import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escolha quantas pernas de 1 a 6: ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3: 
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 5: 
                tipo = "Quintupede";
                break;
            case 6:
                tipo ="Arannha";
                break;
            default:
                tipo = "Et";
                break;
        }
        System.out.println(tipo);
    }
}