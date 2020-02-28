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

    private double coordenada4X, coordenada4Y;
    private String coordenada4;

    public Cuadrilatero(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y, double coordenada4X, double coordenada4Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
        this.coordenada4X = coordenada4X;
        this.coordenada4Y = coordenada4Y;
    }

    //Verificar si es un cuadrado o un rectangulo 
    public boolean verificarCuadrilatero(String tipoCuadrado) {
//        boolean verificarCoord=verificarCoordenadas();
        boolean verificar = false;
        if (tipoCuadrado.equals("Cuadrado")) {
            if (getLado1() == getLado2()) {
                System.out.print("Entro al If ladoIgual \n");
                return verificar = true;
            } else {
                return verificar = false;
            }
        } else if (tipoCuadrado.equals("Rectangulo")) {
            if (getLado1() == getLado2()) {
                System.out.print("Entro al If ladoIgual \n");
                return verificar = false;
            } else {
                return verificar = true;
            }
        } else {
            return verificar = false;
        }
    }

    //verificar coordenadas para No dibujar un ROMBO o un RomBoide
    @Override
    public boolean verificarCoordenadas() {
        boolean verificar = false;
        if (getCoordenada1Y() == getCoordenada2Y() && getCoordenada2X() == getCoordenada3X() && getCoordenada3Y() == this.coordenada4Y && this.coordenada4X == getCoordenada1X()) {
            verificar = true;
        }
        return verificar;
    }

    @Override
    public int[] arrayPuntosEnX() {
        int coordenadaX1 = (int) getCoordenada1X();
        int coordenadaX2 = (int) getCoordenada2X();
        int coordenadaX3 = (int) getCoordenada3X();
        int coordenadaX4 = (int) this.coordenada4X;
        coordenadaX1 = 450 + (coordenadaX1 * 10);
        coordenadaX2 = 450 + (coordenadaX2 * 10);
        coordenadaX3 = 450 + (coordenadaX3 * 10);
        coordenadaX4 = 450 + (coordenadaX4 * 10);
        int puntosEnX[] = {coordenadaX1, coordenadaX2, coordenadaX3, coordenadaX4};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnX;
    }

    @Override
    public int[] arrayPuntosEnY() {
        int coordenadaY1 = (int) getCoordenada1Y();
        int coordenadaY2 = (int) getCoordenada2Y();
        int coordenadaY3 = (int) getCoordenada3Y();
        int coordenadaY4 = (int) this.coordenada4Y;
        coordenadaY1 = 290 - (coordenadaY1 * 10);
        coordenadaY2 = 290 - (coordenadaY2 * 10);
        coordenadaY3 = 290 - (coordenadaY3 * 10);
        coordenadaY4 = 290 - (coordenadaY4 * 10);
        int puntosEnY[] = {coordenadaY1, coordenadaY2, coordenadaY3, coordenadaY4};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnY;
    }

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
