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
    
    public void ingresoCaja(double valor){
        caja += valor;
    }
    
    public void mostrarCaja(){
        System.out.println("Ingreso = "+caja+" $");
    }
}
