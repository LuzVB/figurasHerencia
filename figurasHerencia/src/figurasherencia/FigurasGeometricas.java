/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 *
 * @author Valentina Sarmiento
 */
public class FigurasGeometricas {

    /**
     *
     */
    private int lado1;
    private int lado2;
    private int area;
    private int perimetro;
    private int coordenada1X,coordenada1Y;
    private int coordenada2X,coordenada2Y;
    private int coordenada3X,coordenada3Y;
    private String coordenada1;
    private String coordenada2;
    private String coordenada3;
    private String color;

    //pensar si hacer otro constructor para los lados
    public FigurasGeometricas(int coordenada1X,int coordenada1Y,int coordenada2X,int coordenada2Y,int coordenada3X,int coordenada3Y) {
        this.coordenada1X = coordenada1X;
        this.coordenada1Y = coordenada1Y;
        this.coordenada2X = coordenada1X;
        this.coordenada2Y = coordenada1Y;
        this.coordenada3X = coordenada1X;
        this.coordenada3Y = coordenada1Y;
    }
    
    public FigurasGeometricas(int lado1){
        this.lado1 = lado1;
    }
    //Recibe las coordenadas en pares , para validar si se puede hacer un cuadrado en caso de que si se envia un true
    public boolean verificarCoordenadas(){
        boolean verificar = false;
        //validar segun logica del cuadrado
        return verificar;
    }
    
    //Genera los arrays de puntos x y y para graficar un poligono
    public int[] arrayPuntosEnX(){
        int puntosEnX[]={coordenada1X,coordenada2X,coordenada3X};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnX;
    }
    
    public int[] arrayPuntosEnY(){
        int puntosEnY[]={coordenada1Y,coordenada2Y,coordenada3Y};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnY;
    }

    public void hallarArea() {
        this.area = lado1 * lado1;
    }

    public void hallarPerimetro() {
        this.perimetro = lado1 * 4;
    }

    public void pintar() {

    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
     public int getCoordenada1X() {
        return coordenada1X;
    }

    public void setCoordenada1X(int coordenada1X) {
        this.coordenada1X = coordenada1X;
    }

    public int getCoordenada1Y() {
        return coordenada1Y;
    }

    public void setCoordenada1Y(int coordenada1Y) {
        this.coordenada1Y = coordenada1Y;
    }

    public int getCoordenada2X() {
        return coordenada2X;
    }

    public void setCoordenada2X(int coordenada2X) {
        this.coordenada2X = coordenada2X;
    }

    public int getCoordenada2Y() {
        return coordenada2Y;
    }

    public void setCoordenada2Y(int coordenada2Y) {
        this.coordenada2Y = coordenada2Y;
    }

    public int getCoordenada3X() {
        return coordenada3X;
    }

    public void setCoordenada3X(int coordenada3X) {
        this.coordenada3X = coordenada3X;
    }

    public int getCoordenada3Y() {
        return coordenada3Y;
    }

    public void setCoordenada3Y(int coordenada3Y) {
        this.coordenada3Y = coordenada3Y;
    }

    public String getCoordenada1() {
        return coordenada1;
    }

    public void setCoordenada1(String coordenada1) {
        this.coordenada1 = coordenada1;
    }

    public String getCoordenada2() {
        return coordenada2;
    }

    public void setCoordenada2(String coordenada2) {
        this.coordenada2 = coordenada2;
    }

    public String getCoordenada3() {
        return coordenada3;
    }

    public void setCoordenada3(String coordenada3) {
        this.coordenada3 = coordenada3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
