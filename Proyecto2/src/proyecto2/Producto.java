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
public class Producto {
    
    Gestion g1 = new Gestion();
    Sudaderas s1 = new Sudaderas();
    Camisas c1 = new Camisas();
    Pantalones p1 = new Pantalones();
    double valor;
    double cantidadUnidades;
    
    public void mostrarProductos(){
        System.out.println("1. Sudaderas \n2. Camisas \n3. Pantalones");
    }
    
    public double comprarProductos(int num, double cantidadUnidades){
        
        if(num == 1){
            valor = (s1.valorUnitario *cantidadUnidades);
            this.cantidadUnidades = cantidadUnidades;
            g1.ingresoCaja(valor);
        }
        else if(num == 2){
            valor = (c1.valorUnitario*cantidadUnidades);
            this.cantidadUnidades = cantidadUnidades;
            g1.ingresoCaja(valor);
        }
        else if(num == 3){
            valor = (p1.valorUnitario*cantidadUnidades);
            this.cantidadUnidades = cantidadUnidades;
            g1.ingresoCaja(valor);
        }
        return valor;
    }
    
    public void mostrarFactura(){
        System.out.println("**********FACTURA************");
        System.out.println("valor = "+ valor+"$");
        System.out.println("Cantidad = "+ cantidadUnidades);
    }
    
}
