package view;

import model.Jewelry;
import java.util.List;
import java.util.Scanner;

public class JewelryView {
    private Scanner scanner;

    public JewelryView() {
        this.scanner = new Scanner(System.in);
    }

    
    public int mostrarMenu() {
        System.out.println("\n SISTEMA DE GESTIÓN DE INVENTARIO DE JOYAS ");
        System.out.println("1. Agregar Joya");
        System.out.println("2. Buscar Joya por SKU");
        System.out.println("3. Mostrar Todas las Joyas");
        System.out.println("4. Eliminar Joya");
        System.out.println("5. Buscar por Tipo");
        System.out.println("6. Buscar por Material");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
        
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    
    public Jewelry obtenerDatosJoya() {
        System.out.println("\n--- Agregar Nueva Joya ---");
        System.out.print("Ingrese SKU: ");
        String sku = scanner.nextLine();
        
        System.out.print("Ingrese nombre de la joya: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese tipo (anillo/collar/pulsera/aretes): ");
        String tipo = scanner.nextLine();
        
        System.out.print("Ingrese material (oro/plata/platino): ");
        String material = scanner.nextLine();
        
        System.out.print("Ingrese peso (gramos): ");
        double peso = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese descripción: ");
        String descripcion = scanner.nextLine();

        return new Jewelry(sku, nombre, tipo, material, peso, cantidad, precio, descripcion);
    }

    public String obtenerSku() {
        System.out.print("Ingrese SKU: ");
        return scanner.nextLine();
    }

    public String obtenerTipo() {
        System.out.print("Ingrese tipo para buscar (anillo/collar/pulsera/aretes): ");
        return scanner.nextLine();
    }


    public String obtenerMaterial() {
        System.out.print("Ingrese material para buscar (oro/plata/platino): ");
        return scanner.nextLine();
    }

    
    public void mostrarJoya(Jewelry joya) {
        if (joya != null) {
            System.out.println("\n Detalles de la Joya:");
            System.out.println(joya.toString());
        } else {
            System.out.println("Joya no encontrada.");
        }
    }

    public void mostrarTodasLasJoyas(List<Jewelry> listaJoyas) {
        if (listaJoyas.isEmpty()) {
            System.out.println("No hay joyas en el inventario.");
        } else {
            System.out.println("\nTodas las Joyas (" + listaJoyas.size() + " items):");
            for (int i = 0; i < listaJoyas.size(); i++) {
                System.out.println((i + 1) + ". " + listaJoyas.get(i).toShortString());
            }
        }
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        scanner.close();
    }
}