/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Scanner;
/**
 *
 * @author jose-
 */
public class Proyecto2 {
    
    public static void mostrarMenu(){
        System.out.println("Introduzca la opción que desea realizar: ");
        System.out.println("1. Mostrar productos");
        System.out.println("2. Vender productos");
        System.out.println("3. Mostrar caja");
        System.out.println("4. Salir");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opciones = 0;
        boolean salida = true;
        Producto p1 = new Producto();
        
        Scanner sc = new Scanner(System.in);
        
        while(salida){
           mostrarMenu(); 
           opciones = sc.nextInt();
           switch(opciones){
               case 1:
                   p1.s1.mostrarSudaderas();
                   p1.c1.mostrarCamisas();
                   p1.p1.mostrarPantalones();
                   break;
                   
               case 2:
                   System.out.println("Ingrese el numero del producto: ");
                   int num = 0;
                   double cantidad = 0;
                   num = sc.nextInt();
                   if(num == 1){
                       System.out.println("Ingrese la cantidad de productos: ");
                       cantidad = sc.nextInt();
                       p1.comprarProductos(num, cantidad);
                       p1.mostrarFactura();
                       break;
                   }
                    if(num == 2){
                        System.out.println("Ingrese la cantidda de productos: ");
                        cantidad = sc.nextInt();
                        p1.comprarProductos(num, cantidad);
                        p1.mostrarFactura();
                        break;
                    }
                    if(num == 3){
                        System.out.println("Ingrese la cantidad de productos: ");
                        cantidad = sc.nextInt();
                        p1.comprarProductos(num, cantidad);
                        p1.mostrarFactura();
                        break;
                    }
               case 3:
                   if(opciones==3){
                       p1.g1.mostrarCaja();
                       break;
                   }              
               case 4:
                   salida = false;
           }
        }
    }
}
