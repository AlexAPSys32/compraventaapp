package org.palomafp.compraventa;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;

        ComprasDAO objeto = new ComprasDAO();

        do {
            menu();
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    objeto.mostrarTodasLasCompras();
                    break;
                case 2:
                    System.out.print("Introduce el ID de la compra a buscar: ");
                    int id = sc.nextInt();
                    objeto.mostrarCompraPorId(id);
                    break;
                case 3:
                    objeto.mostrarCompraAleatoria();
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
        } while (eleccion != 5);

        sc.close();

    }

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
