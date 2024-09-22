
import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) throws Exception {
        int num[] = {3,5,1,8,4};
        Arrays.sort(num);
        for (int valor:num) {
            System.out.print(valor + " ");
        }
    }
}
