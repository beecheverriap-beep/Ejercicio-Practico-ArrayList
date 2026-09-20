import java.util.ArrayList;

public class Main {

    private static ArrayList<String> inventario = new ArrayList<>();

    public static void main(String[] args) {

        agregarObjeto("Espada de acero");
        agregarObjeto("Poción de vida");
        agregarObjeto("Mapa del tesoro");

        mostrarInventario();

        retirarObjeto(1); // Elimina el elemento en el índice 1 ("Poción de vida")

        mostrarInventario();
    }


    public static void agregarObjeto(String objeto) {
        inventario.add(objeto);
        System.out.println("Se añadió: " + objeto);
    }


    public static void mostrarInventario() {
        System.out.println("\n--- ESTADO DEL INVENTARIO (" + inventario.size() + " objetos) ---");
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < inventario.size(); i++) {
                System.out.println("Índice " + i + ": " + inventario.get(i));
            }
        }

    }


    public static void retirarObjeto(int indice) {
        if (indice >= 0 && indice < inventario.size()) {
            String removido = inventario.remove(indice);
            System.out.println("\nSe retiró del inventario: " + removido);
        } else {
            System.out.println("\nError: El índice " + indice + " no existe en el inventario.");
        }
    }
}