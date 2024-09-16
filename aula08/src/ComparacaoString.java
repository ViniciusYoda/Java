public class ComparacaoString {
    public static void main(String[] args) throws Exception {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res, res2; 
        res = (nome1 == nome2)  ? "igual":"diferente";
        res2 = (nome1.equals(nome3))  ? "igual":"diferente";
        System.out.println(res);
        System.out.println(res2);
    }
}