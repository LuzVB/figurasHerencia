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
public class Triangulo extends FigurasGeometricas {
    
    private int lado2;
    private int lado3;

    public Triangulo(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
    }
    
    public Triangulo(int lado1 , int lado2 , int lado3){
        super(lado1);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
}
