package org.palomafp.compraventa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal de la aplicación de compraventa.
 * @author Miguel
 * @author Alejandro
 */
public class App {
    /**
     * Metodo main que muestra un menú para usar la clase ComprasDAO y sus métodos.
     * 
     * @param args para usar system.in y system.out.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;

        ComprasDAO objeto = new ComprasDAO();

        do {
            try {

                menu();
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println(objeto.getAllCompras());
                        break;
                    case 2:
                        System.out.print("Introduce el ID de la compra a buscar: ");
                        int id = sc.nextInt();
                        System.out.println(objeto.getByidCompra(id));
                        break;
                    case 3:
                        System.out.println(objeto.getRandomCompra());
                        break;
                    case 4:
                        objeto.mostrarMerchandising();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un valor numérico");
                sc.nextLine();
            }
        } while (eleccion != 5);

        sc.close();

    }

    /**
     * Sirve para mostrar las opciones del menu. Se pone fuera del main para mayor
     * claridad del codigo.
     */
    public static void menu() {
        System.out.println("\n===============================MENÚ===============================");
        System.out.println("========> 1. Mostrar todas las compras                      <====");
        System.out.println("========> 2. Buscar compra por ID                           <====");
        System.out.println("========> 3. Mostrar una compra aleatoria                   <====");
        System.out.println("========> 4. Mostrar información de los Merchandising        <====");
        System.out.println("========> 5. Salir                                           <====");
        System.out.println("==================================================================\n");
    }
}
