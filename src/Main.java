import java.util.ArrayList;

public class Main {

    // ArrayList de inventario
    private static ArrayList<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // 1. Cargar al menos cinco objetos
        agregarObjeto("Espada de acero");
        agregarObjeto("Escudo de roble");
        agregarObjeto("Poción de vida");
        agregarObjeto("Mapa del tesoro");
        agregarObjeto("Anillo de fuerza");

        // Mostrar el informe inicial recorriendo con ciclo for
        mostrarInforme();

        // 2. Eliminar un objeto existente
        retirarObjeto("Poción de vida");

        // 3. Intentar eliminar un objeto inexistente sin provocar errores
        retirarObjeto("Hacha de guerra");

        // 4. Comprobar la existencia de un objeto
        buscarObjeto("Mapa del tesoro");
        buscarObjeto("Poción de vida");

        // Mostrar informe actualizado
        mostrarInforme();

        // 5. Muestra el tamaño final del ArrayList usando size()
        System.out.println("Tamaño final del inventario: " + inventario.size());
    }

    // Método propio para agregar objetos
    public static void agregarObjeto(String objeto) {
        inventario.add(objeto);
        System.out.println("Añadido: " + objeto);
    }

    // Método propio para retirar objetos de forma segura sin provocar errores
    public static void retirarObjeto(String objeto) {
        if (inventario.contains(objeto)) {
            inventario.remove(objeto);
            System.out.println("Retirado con éxito: " + objeto);
        } else {
            System.out.println("No se pudo retirar. El objeto '" + objeto + "' no existe en el inventario.");
        }
    }

    // Método propio para buscar si un objeto existe
    public static void buscarObjeto(String objeto) {
        if (inventario.contains(objeto)) {
            System.out.println("El objeto '" + objeto + "' SÍ está en el inventario.");
        } else {
            System.out.println("El objeto '" + objeto + "' NO está en el inventario.");
        }
    }

    // Método propio para mostrar el informe con ciclo for tradicional, get() y size()
    public static void mostrarInforme() {
        System.out.println("\n===== INFORME DE INVENTARIO =====");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Posición " + i + ": " + inventario.get(i));
        }
        System.out.println("=================================\n");
    }
}