/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Scanner;
import static proyecto2.Camisas.inventarioC;
import static proyecto2.Pantalones.inventarioP;
import static proyecto2.Sudaderas.inventarioS;

/**
 *
 * @author jose-
 */
public class Proyecto2 {
    
    public static void mostrarMenuAdmin(){
        System.out.println("--------------------------------");
        System.out.println("Panel de Administración");
        System.out.println("--------------------------------");
        System.out.println("Productos disponibles ");
        Producto p1 = new Producto();
        p1.s1.listarSudaderas();
        p1.c1.listarCamisas();
        p1.p1.listarPantalones();
        System.out.println("--------------------------------");
        System.out.println("Introduzca la opción que desea realizar: ");
        System.out.println("1. Ingresar Camisas");
        System.out.println("2. Ingresar Pantalones");
        System.out.println("3. Ingresar Sudadera");
        System.out.println("4. Cerrar Sesion");
        System.out.println("--------------------------------\n");
        
    }

    public static void MenuAdmin () {
        Scanner sc = new Scanner(System.in);  
        
        int opciones = 0,  cantidad=0;
        boolean salida = true;
        String marca;
        double valor;

        
        Camisas c1 = new Camisas();
        Pantalones p1 = new Pantalones();
        Sudaderas s1 = new Sudaderas();
        
        while(salida){
           mostrarMenuAdmin(); 
           opciones = sc.nextInt();
           switch(opciones){
               case 1:
                   System.out.println("\nAñadir Camisas");
                   valor = 55000;
                   System.out.println("Ingrese la marca");
                   marca= sc.next();
                   System.out.println("Ingrese la cantidad");
                   cantidad= sc.nextInt();
                   c1.agregarCamisa(marca, valor, cantidad);
                   break;
                   
               case 2:
                   System.out.println("\nAñadir Pantalones");
                   valor = 80000;
                   System.out.println("Ingrese la marca");
                   marca= sc.next();
                   System.out.println("Ingrese la cantidad");
                   cantidad= sc.nextInt();
                   p1.agregarPantalon(marca, valor, cantidad);
                   break;
               case 3:
                   System.out.println("\nAñadir Sudaderas");
                   valor = 30000;
                   System.out.println("Ingrese la marca");
                   marca= sc.next();
                   System.out.println("Ingrese la cantidad");
                   cantidad= sc.nextInt();
                   s1.agregarSudadera(marca, valor, cantidad);
                   break;             
               case 4:
                   salida = false;     
                   break;
           }
        }
    }
    
    public static void mostrarMenuCliente(){
        System.out.println("--------------------------------");
        System.out.println("Panel de Cliente");
        System.out.println("--------------------------------");
        System.out.println("Introduzca la opción que desea realizar: ");
        System.out.println("1. Mostrar productos");
        System.out.println("2. Comprar productos");
        System.out.println("3. Mostrar Carrito");
        System.out.println("4. Cerrar Sesion");
        System.out.println("--------------------------------");
    }
    
    public static void MenuCliente () {
            
        int opciones = 0;
        boolean salida = true;
        Producto p1 = new Producto();
        
        Scanner sc = new Scanner(System.in);
        
        while(salida){
           mostrarMenuCliente(); 
           opciones = sc.nextInt();
           switch(opciones){
               case 1:
                   p1.s1.listarSudaderas();
                   p1.c1.listarCamisas();
                   p1.p1.listarPantalones();
                   break;
                   
               case 2:
                   p1.mostrarProductos();
                   System.out.println("Ingrese el numero del producto: ");
                   int num = 0;
                   double cantidad = 0;
                   num = sc.nextInt();
                   if(num == 1){
                        if (inventarioS.isEmpty()) {
                            System.out.println("El inventario de sudaderas está vacío.");
                        } else {
                            System.out.println("Ingrese la cantidad de productos: ");
                            cantidad = sc.nextInt();
                            p1.comprarProductos(num, cantidad);
                            p1.mostrarFactura();
                        }
                       
                       break;
                   }
                    if(num == 2){
                        if (inventarioC.isEmpty()) {
                            System.out.println("El inventario de camisas está vacío.");
                        } else {
                        System.out.println("Ingrese la cantidad de productos: ");
                        cantidad = sc.nextInt();
                        p1.comprarProductos(num, cantidad);
                        p1.mostrarFactura();
                        }
                        break;
                    }
                    if(num == 3){
                        if (inventarioP.isEmpty()) {
                            System.out.println("El inventario de pantalones está vacío.");
                        } else {
                        System.out.println("Ingrese la cantidad de productos: ");
                        cantidad = sc.nextInt();
                        p1.comprarProductos(num, cantidad);
                        p1.mostrarFactura();
                        }
                        break;
                    }
               case 3:
                   System.out.println("--------------------------------");
                   System.out.println("Mi carrito");
                       p1.g1.mostrarCarrito();
                    System.out.println("--------------------------------");
                       break;        
               case 4:
                   salida = false;     
                   break;
           }
        }

    }
    
    public static void mostrarMenuSesion(){
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la Tienda de Ropas");
        System.out.println("--------------------------------");
        System.out.println("Introduzca la opción que desea realizar: ");
        System.out.println("1. Admin");
        System.out.println("2. Cliente");
        System.out.println("3. Salir");
        System.out.println("--------------------------------\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opciones = 0;
        boolean inicio = false;
        boolean salida = true;
        
        Scanner sc = new Scanner(System.in);
        
        while(salida){
           mostrarMenuSesion(); 
           opciones = sc.nextInt();
           switch(opciones){
               case 1:
                   MenuAdmin();
                   inicio = true;
                   break;
                   
               case 2:
                   if (inicio == true){
                       MenuCliente();
                   }else{
                       System.out.println("\n--------------------------------");
                       System.out.println("No hay productos disponibles");   
                       System.out.println("--------------------------------\n");
                   }
                   
                   break;
               case 3:
                     salida = false;           
                   
           }
        }
    }
}
