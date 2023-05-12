package ObjetosProyecto;

import java.util.ArrayList;

public class Consecionario {
    private ArrayList<Cliente> cliente;

    public Consecionario() {
        cliente = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        cliente.add(cliente);
        System.out.println("El cliente " + cliente.getNombre() + "\nDni" + cliente.getDni() + "\nEmail"
                + cliente.getEmail() + "\nNumero" + cliente.getNumero());
    }

}
