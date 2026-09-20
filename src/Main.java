import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declara un ArrayList de cadenas de texto llamado inventario
        ArrayList<String> inventario = new ArrayList<>();

        // Añade exactamente tres elementos relacionados con una aventura
        inventario.add("Espada de acero");
        inventario.add("Poción de vida");
        inventario.add("Mapa del tesoro");

        // Muestra la lista completa por consola
        System.out.println("Inventario: " + inventario);

        // Comprueba que su tamaño sea 3 usando size()
        System.out.println("Tamaño del inventario: " + inventario.size());
    }
}
