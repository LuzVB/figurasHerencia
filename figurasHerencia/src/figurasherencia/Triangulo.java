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

    private double lado3;

    public Triangulo(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
    }
    
    
    @Override
    public void hallarLado() {
        double raiz,raiz2;
        double potencia1, potencia2;

        potencia1 = Math.pow((getCoordenada2X() - getCoordenada1X()), 2);
        potencia2 = Math.pow((getCoordenada2Y() - getCoordenada1Y()), 2);
        raiz = Math.sqrt(potencia1+potencia2);
        
        setLado1(raiz) ;
        
        potencia1 = Math.pow((getCoordenada3X() - getCoordenada2X()), 2);
        potencia2 = Math.pow((getCoordenada3Y() - getCoordenada2Y()), 2);
        raiz = Math.sqrt(potencia1+potencia2);
        
        setLado2(raiz) ;
        
        potencia1 = Math.pow((getCoordenada1X() - getCoordenada3X()), 2);
        potencia2 = Math.pow((getCoordenada1Y() - getCoordenada3Y()), 2);
        raiz = Math.sqrt(potencia1+potencia2);
        
        this.lado3=raiz;
    }
    
   /* public Triangulo(int lado1 , int lado2 , int lado3){
        super(lado1);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }*/
    
    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
}
