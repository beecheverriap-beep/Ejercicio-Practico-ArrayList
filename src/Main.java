import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Carga inicial de al menos 5 objetos
        agregarObjeto("Espada de acero");
        agregarObjeto("Escudo de roble");
        agregarObjeto("Poción de vida");
        agregarObjeto("Mapa del tesoro");
        agregarObjeto("Anillo de fuerza");

        // Instancia y prueba de la clase Estudiante requerida por NORA
        Estudiante alumno = new Estudiante("Juan Pérez", 20, 5.8);
        System.out.println("\n--- Datos del Estudiante Evaluado ---");
        alumno.mostrarInformacion();

        int opcion = 0;

        // Bucle interactivo mediante while
        while (opcion != 6) {
            System.out.println("\n=== BOSS FINAL: GESTIÓN DE INVENTARIO ===");
            System.out.println("1. Mostrar informe de inventario");
            System.out.println("2. Agregar objeto");
            System.out.println("3. Retirar objeto existente");
            System.out.println("4. Intentar retirar objeto inexistente");
            System.out.println("5. Buscar objeto (contains)");
            System.out.println("6. Salir y mostrar tamaño final");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Control de flujo con if / else if / else
            if (opcion == 1) {
                mostrarInforme();
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del objeto a agregar: ");
                String nuevoObjeto = scanner.nextLine();
                agregarObjeto(nuevoObjeto);
            } else if (opcion == 3) {
                retirarObjeto("Poción de vida");
            } else if (opcion == 4) {
                retirarObjeto("Objeto Inexistente XYZ");
            } else if (opcion == 5) {
                System.out.print("Ingrese el nombre del objeto a buscar: ");
                String busqueda = scanner.nextLine();
                buscarObjeto(busqueda);
            } else if (opcion == 6) {
                System.out.println("\nSaliendo del sistema...");
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        // Muestra el tamaño final del ArrayList antes de terminar
        System.out.println("Tamaño final del inventario: " + inventario.size());
        scanner.close();
    }

    // Método para agregar objetos
    public static void agregarObjeto(String objeto) {
        inventario.add(objeto);
        System.out.println("Añadido: " + objeto);
    }

    // Método para retirar objetos (evita errores consultando contains)
    public static void retirarObjeto(String objeto) {
        if (inventario.contains(objeto)) {
            inventario.remove(objeto);
            System.out.println("Retirado con éxito: " + objeto);
        } else {
            System.out.println("No se pudo retirar. El objeto '" + objeto + "' no existe en el inventario.");
        }
    }

    // Método para buscar objeto
    public static void buscarObjeto(String objeto) {
        if (inventario.contains(objeto)) {
            System.out.println("El objeto '" + objeto + "' SÍ está en el inventario.");
        } else {
            System.out.println("El objeto '" + objeto + "' NO está en el inventario.");
        }
    }

    // Informe que recorre la lista con un ciclo for tradicional
    public static void mostrarInforme() {
        System.out.println("\n===== INFORME DE INVENTARIO =====");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Posición " + i + ": " + inventario.get(i));
        }
        System.out.println("=================================");
    }
}