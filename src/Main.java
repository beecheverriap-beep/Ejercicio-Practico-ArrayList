 import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();


        inventario.add("1- inventiario");
        inventario.add("2- inventario");
        inventario.add("3- inventario");


        for (int i = 0; i < inventario.size(); i++){
            System.out.println("Indice: " + i + " - " + inventario.get(i));
        }
        inventario.set(1, "nuevoValor");

        System.out.println("Actualizacion");
        System.out.println("Nuevo elemento: " + inventario.get(1));
        System.out.println("Tamaño del inventario: " + inventario.size());

        for ( int i = inventario.size() - 1;  i >= 0; i--){
            System.out.println("Indice" + i +  "-" + inventario.get(i));
        }
    }
}
