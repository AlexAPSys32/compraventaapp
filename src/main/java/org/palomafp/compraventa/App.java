package org.palomafp.compraventa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;

        do {
            menu();
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Mostrando información de compras");
                    ComprasDAO comprasDAO = new ComprasDAO();
                    String[] compras = comprasDAO.mostrarCompras();
                    for (String compra : compras) {
                        System.out.println(compra);
                    }
                    break;
                case 2:
                    System.out.println("Mostrando información del Historial de precios");
                    break;
                case 3:
                    System.out.println("Mostrando información de las tiendas");
                    break;
                case 4:
                    System.out.println("Mostrando información de los Merchandising");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (eleccion != 5);


    }

    public static void menu() {
        System.out.println("\n===============================MENÚ===============================");
        System.out.println("========> 1. Mostrar información de un videojuego            <===="); 
        System.out.println("========> 2. Mostrar información del Historial de precios    <====");
        System.out.println("========> 3. Mostrar información de las tiendas              <====");
        System.out.println("========> 4. Mostrar información de los Merchandising        <====");
        System.out.println("========> 5. Salir                                           <====");
        System.out.println("==================================================================\n");        
    }
}
