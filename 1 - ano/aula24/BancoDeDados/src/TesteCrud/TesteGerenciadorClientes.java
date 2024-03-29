package TesteCrud;

import java.sql.SQLException;
import java.util.List;

public class TesteGerenciadorClientes {
    public static void main(String[] args) throws Exception {

        try {
            GerenciadorClientes gc = new GerenciadorClientes();

            gc.inserir(new Cliente("Fernando", "Almeida"));

            List<Cliente> clientes = gc.listar();

            for(Cliente c : clientes){
                System.out.println(c.toString());
            }

            
        }catch(SQLException e){
            System.err.println("Erro na transação " + e.getStackTrace());
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
