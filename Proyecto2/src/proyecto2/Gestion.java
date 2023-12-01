/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author jose-
 */
public class Gestion {
     double caja = 0;

     Contador contador;
     
     public Gestion(Contador contador) {
        this.contador = contador;
    }

     
    public void ingresoCaja(double valor) {
        caja += valor;
    }

    public void mostrarCarrito() {
        System.out.println("Ingreso = " + caja + " $");
        System.out.println("Cantidad de productos:");
        // Aquí accedes a los métodos de Contador para obtener la cantidad de productos por categoría
        System.out.println("Camisas: " + contador.getCantidadDisponible("Camisas"));
        System.out.println("Sudaderas: " + contador.getCantidadDisponible("Sudaderas"));
        System.out.println("Pantalones: " + contador.getCantidadDisponible("Pantalones"));
    }
}
