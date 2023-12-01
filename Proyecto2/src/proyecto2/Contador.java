/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author jose-
 */
public class Contador {
     private Map<String, Integer> comprasPorCategoria;

    public Contador() {
        comprasPorCategoria = new HashMap<>();
    }

    public void agregarCantidad(String categoria, int cantidad) {
        comprasPorCategoria.put(categoria, comprasPorCategoria.getOrDefault(categoria, 0) + cantidad);
        System.out.println(cantidad + " Unidades de: " + categoria + " agregadas.");
    }

    public void comprar(String categoria, int cantidad) {
        int cantidadDisponible = comprasPorCategoria.getOrDefault(categoria, 0);
        if (cantidad <= cantidadDisponible) {
            comprasPorCategoria.put(categoria, cantidadDisponible - cantidad);
            System.out.println("Compra realizada: " + cantidad + " Unidades de: " + categoria);
        } else {
            System.out.println("No hay suficientes unidades de: " + categoria + " disponibles.");
        }
    }

    public int getCantidadDisponible(String categoria) {
        return comprasPorCategoria.getOrDefault(categoria, 0);
    }

    public void setCantidadDisponible(String categoria, int cantidadDisponible) {
        comprasPorCategoria.put(categoria, cantidadDisponible);
    }
}
