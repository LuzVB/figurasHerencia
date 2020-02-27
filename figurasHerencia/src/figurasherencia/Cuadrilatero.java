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
    
    private double coordenada4X,coordenada4Y;
    private String coordenada4;

    public Cuadrilatero(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y,double coordenada4X, double coordenada4Y ) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
        this.coordenada4X = coordenada4X;
        this.coordenada4Y = coordenada4Y;
    }
    
    //Verificar si es un cuadrado o un rectangulo 
    public boolean verificarCuadrilatero(){
        boolean verificar=true;
        //si son iguales es un Cuadrado
        if(getLado1() == getLado2()){
            return verificar=true;
        }
        else{
            return verificar=false;//rectangulo
        }
    }
    
    
    
    //verificar coordenadas para No dibujar un ROMBO o un RomBoide
    @Override
    public boolean verificarCoordenadas(){
        boolean verificar=false;
        
        if(getCoordenada1Y()== getCoordenada2Y() && getCoordenada2X() == getCoordenada3X() && getCoordenada3Y() == this.coordenada4Y 
           && this.coordenada4X == getCoordenada1X()){   
            verificar = true;
        }
        
        return verificar;
    }
    
    
//    @Override
//    public  double[] arrayPuntosEnX(){
//        double puntosEnX[]={getCoordenada1X(),getCoordenada2X(),getCoordenada3X(),coordenada4X};
//        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
//        return puntosEnX;
//    }
//    
//    
//    @Override
//    public  double[] arrayPuntosEnY(){
//        double puntosEnY[]={getCoordenada1Y(),getCoordenada2Y(),getCoordenada3Y(),coordenada4X};
//        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
//        return puntosEnY;
//    }
    
    
    public double getCoordenada4X() {
        return coordenada4X;
    }

    public void setCoordenada4X(short coordenada4X) {
        this.coordenada4X = coordenada4X;
    }

    public double getCoordenada4Y() {
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
