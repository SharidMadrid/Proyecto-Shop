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
public class Pantalones {

    public String marca;
    public double valorUnitario= 80000;
    public static Stack<Pantalones> inventarioP = new Stack<>();
    public int cantidadIngresada = 0;
    
    public Pantalones(String marca, double valorUnitario) {
        this.marca = marca;
        this.valorUnitario = valorUnitario;
    }

    public static void agregarPantalon(String marca, double valorUnitario,int cantidad) {
        Pantalones nuevoPantalon = new Pantalones(marca, valorUnitario);
        nuevoPantalon.cantidadIngresada = cantidad;
        inventarioP.push(nuevoPantalon);
        System.out.println("¡Se ha agregado " + cantidad + " el pantalón " + marca + " al inventario!");
    }

    public static void listarPantalones() {
        if (inventarioP.isEmpty()) {
            System.out.println("El inventario de pantalones está vacío.");
        } else {
            System.out.println("Inventario de pantalones:");
            for (Pantalones pantalon : inventarioP) {
                System.out.println("Marca: " + pantalon.marca + " - Valor: " + pantalon.valorUnitario+
                                   " - Cantidad ingresada: " + pantalon.cantidadIngresada);
            }
        }
    }

    public Pantalones() {
    }

    public static Stack<Pantalones> getInventario() {
        return inventarioP;
    }

    public static void setInventario(Stack<Pantalones> inventario) {
        Pantalones.inventarioP = inventario;
    }


}
