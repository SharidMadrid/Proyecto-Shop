/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Stack;
/**
 *
 * @author jose-
 */
public class Camisas {
    
    public String marca;
    public double valorUnitario= 55000;
    public static Stack<Camisas> inventarioC = new Stack<>();
    public int cantidadIngresada = 0;

    
    public Camisas(String marca, double valorUnitario) {
        this.marca = marca;
        this.valorUnitario = valorUnitario;
    }
    
     public static void agregarCamisa(String marca, double valorUnitario, int cantidad) {
        Camisas nuevaCamisa = new Camisas(marca, valorUnitario);
        nuevaCamisa.cantidadIngresada = cantidad; // Se asigna la cantidad ingresada
        inventarioC.push(nuevaCamisa);
        System.out.println("¡Se han agregado " + cantidad + " camisas de la marca " + marca + " al inventario!");
     }

    public static void listarCamisas() {
        if (inventarioC.isEmpty()) {
            System.out.println("El inventario de camisas está vacío.");
        } else {
            System.out.println("Inventario de camisas:");
            for (Camisas camisa : inventarioC) {
                System.out.println("Marca: " + camisa.marca + " - Valor: " + camisa.valorUnitario +
                                   " - Cantidad ingresada: " + camisa.cantidadIngresada);
            }
        }
    }

    public Camisas() {
    }

    public static Stack<Camisas> getInventario() {
        return inventarioC;
    }

    public static void setInventario(Stack<Camisas> inventario) {
        Camisas.inventarioC = inventario;
    }
    
    
}
