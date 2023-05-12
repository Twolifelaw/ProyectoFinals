package ObjetosProyecto;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Brandon", "1001277430", "Brandone.acevedoc@uqvirutal.edu.co", "3153033412");
        Consecionario consecionario = new Consecionario();
        consecionario.registrarCliente(cliente1);
    }
    
}
