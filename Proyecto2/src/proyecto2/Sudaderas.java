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
import java.util.Stack;

public class Sudaderas {

    public String marca;
    public double valorUnitario= 30000;
    public static Stack<Sudaderas> inventarioS = new Stack<>();
    public int cantidadIngresada = 0;

    public Sudaderas(String marca, double valorUnitario) {
        this.marca = marca;
        this.valorUnitario = valorUnitario;
    }

    public static void agregarSudadera(String marca, double valorUnitario,int cantidad) {
        Sudaderas nuevaSudadera = new Sudaderas(marca, valorUnitario);
        nuevaSudadera.cantidadIngresada = cantidad;
        inventarioS.push(nuevaSudadera);
        System.out.println("¡Se ha agregado " + cantidad + " la sudadera " + marca + " al inventario!");
    }

    public static void listarSudaderas() {
        if (inventarioS.isEmpty()) {
            System.out.println("El inventario de sudaderas está vacío.");
        } else {
            System.out.println("Inventario de sudaderas:");
            for (Sudaderas sudadera : inventarioS) {
                System.out.println("Marca: " + sudadera.marca + " - Valor: " + sudadera.valorUnitario+
                                   " - Cantidad ingresada: " + sudadera.cantidadIngresada);
            }
        }
    }

    Sudaderas() {
    }

    public static Stack<Sudaderas> getInventario() {
        return inventarioS;
    }

    public static void setInventario(Stack<Sudaderas> inventario) {
        Sudaderas.inventarioS = inventario;
    }
    

}
