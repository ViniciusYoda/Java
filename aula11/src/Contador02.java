public class Contador02 {
    public static void main(String[] args) throws Exception {
        int cc = 0;
        String contagem = "";
        while (cc<5) {
            contagem += cc + " ";
            cc++;
        }
        System.out.println(contagem);

    }
}