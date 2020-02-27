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
public class Cuadrilatero extends FigurasGeometricas {
    
    private int coordenada4X,coordenada4Y;
    private String coordenada4;

    public Cuadrilatero(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y,int coordenada4X, int coordenada4Y ) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
        this.coordenada4X = coordenada4X;
        this.coordenada4Y = coordenada4Y;
    }
    
    @Override
    public  int[] arrayPuntosEnX(){
        int puntosEnX[]={getCoordenada1X(),getCoordenada2X(),getCoordenada3X(),coordenada4X};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnX;
    }
    
    
    @Override
    public  int[] arrayPuntosEnY(){
        int puntosEnY[]={getCoordenada1Y(),getCoordenada2Y(),getCoordenada3Y(),coordenada4X};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnY;
    }
    
    
    public int getCoordenada4X() {
        return coordenada4X;
    }

    public void setCoordenada4X(short coordenada4X) {
        this.coordenada4X = coordenada4X;
    }

    public int getCoordenada4Y() {
        return coordenada4Y;
    }

    public void setCoordenada4Y(short coordenada4Y) {
        this.coordenada4Y = coordenada4Y;
    }

    public String getCoordenada4() {
        return coordenada4;
    }

    public void setCoordenada4(String coordenada4) {
        this.coordenada4 = coordenada4;
    }
     
}
