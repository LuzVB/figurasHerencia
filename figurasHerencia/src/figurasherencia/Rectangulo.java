/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 *
 * @author Luz
 */
public class Rectangulo extends Cuadrilatero {
    
    private int lado2;

    public Rectangulo(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y, int coordenada4X, int coordenada4Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y, coordenada4X, coordenada4Y);
    }
    
    //buscar como hacer para enviar el lado2 del rectangulo 
    /*public Rectangulo(int lado1 , int lado2 ){
        super(lado1);
        this.lado2 = lado2;
    }*/
    
}
