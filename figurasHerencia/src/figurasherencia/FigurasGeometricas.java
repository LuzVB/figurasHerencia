/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 * Clase padre 
 * @author Valentina Sarmiento
 */
public class FigurasGeometricas {
    /**
     * la variable lado1 almacena el valor del primer lado de la figura
     */
    private double lado1;
    /**
     * la variable lado2 almacena el valor del segundo lado de la figura
     */
    private double lado2;
    /**
     *la variable area almacena el valor del area la figura
     */
    private double area;
    /**
     *la variable perimetro almacena el valor del  periemetro de la figura
     */
    private double perimetro;
    /**
     * las variables coordenada1X y coordenada1Y  almacenan los valores de  X y Y de la primera coordenada 
     */
    private double coordenada1X, coordenada1Y;
    /**
     * las variables coordenada2X y coordenada2Y   almacenan los valores de  X y Y de la segunda coordenada
     */
    private double coordenada2X, coordenada2Y;
    /**
     * las variables coordenada3X y coordenada3Y   almacenan los valores de  X y Y de la tercera coordenada
     */
    private double coordenada3X, coordenada3Y;
    /**
     * la variable coordenada1 almacena el valor de la primera coordenda
     */
    private String coordenada1;
    
    /**
     * la variable coordenada2 almacena el valor de la segunda coordenda
     */
    private String coordenada2;
    /**
     * la variable coordenada3 almacena el valor de la tercera coordenda
     */
    private String coordenada3;
    /**
     * la variable color almacena el color seleccionado 
     */
    private String color;
    //Quitar decimales alas variables doubles
    //DecimalFormat decimales = new DecimalFormat("#.0");
    /**
     * Constructor que recibe los valores de las tres coordendas en X y Y  
     * @param coordenada1X valor de X de la primera coordenda 
     * @param coordenada1Y valor de Y de la primera coordenda 
     * @param coordenada2X valor de X de la segunda coordenda 
     * @param coordenada2Y valor de Y de la segunda coordenda 
     * @param coordenada3X valor de X de la tercera coordenda 
     * @param coordenada3Y valor de Y de la tercera coordenda 
     */
    public FigurasGeometricas(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y) {
        this.coordenada1X = coordenada1X;
        this.coordenada1Y = coordenada1Y;
        this.coordenada2X = coordenada2X;
        this.coordenada2Y = coordenada2Y;
        this.coordenada3X = coordenada3X;
        this.coordenada3Y = coordenada3Y;
        hallarLado();
    }

    /*public FigurasGeometricas(int lado1) {
     this.lado1 = lado1;
     }*/
    /**
     * Metodo que recibe las coordenadas en pares , para validar si se puede
     * dibujar un triangulo
     * @return verificar retorna un false si se cumplen las condiciones 
     */
    public boolean verificarCoordenadas() {
        boolean verificar = true;

        if (this.coordenada1X == this.coordenada2X && this.coordenada2Y == this.coordenada3Y) {
            verificar = false;
        }
        return verificar;
    }

    /**
     * Metodo para hallar la distancia de cada uno de los lados
     */
    public void hallarLado() {
        double raiz, raiz2;
        double potencia1, potencia2;

        potencia1 = Math.pow((this.coordenada2X - this.coordenada1X), 2);
        potencia2 = Math.pow((this.coordenada2Y - this.coordenada1Y), 2);
        raiz = Math.sqrt(potencia1 + potencia2);

        this.lado1 = raiz;

        potencia1 = Math.pow((this.coordenada3X - this.coordenada2X), 2);
        potencia2 = Math.pow((this.coordenada3Y - this.coordenada2Y), 2);
        raiz = Math.sqrt(potencia1 + potencia2);

        this.lado2 = raiz;
    }

    /**
     * Metodo que genera los arrays de los puntos x para graficar un poligono
     * @return puntoEnX retorna un array
     */
    public int[] arrayPuntosEnX() {
       //int puntosEnX[] = {coordenada1X, coordenada2X, coordenada3X};



        int coordenadaX1 = (int) this.coordenada1X;
        int coordenadaX2 = (int) this.coordenada2X;
        int coordenadaX3 = (int) this.coordenada3X;
        coordenadaX1=450+(coordenadaX1*10);
        coordenadaX2=450+(coordenadaX2*10);
        coordenadaX3=450+(coordenadaX3*10);
        int puntosEnX[] = {coordenadaX1, coordenadaX2, coordenadaX3};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnX;
    }

    /**
     * Metodo que genera los arrays de los puntos y para graficar un poligono
     * @return puntoEnY retorna un array
     */
    public int[] arrayPuntosEnY() {

        int coordenadaY1 = (int) this.coordenada1Y;
        int coordenadaY2 = (int) this.coordenada2Y;
        int coordenadaY3 = (int) this.coordenada3Y;
        coordenadaY1=290-(coordenadaY1*10);
        coordenadaY2=290-(coordenadaY2*10);
        coordenadaY3=290-(coordenadaY3*10);
        int puntosEnY[] = {coordenadaY1, coordenadaY2, coordenadaY3};
        // hacer logica segun el trinagulo , reescribir en cuadrilatero 
        return puntosEnY;
    }

    /**
     * Metodo para hallar el area de un cuadrado
     */
    public void hallarArea() {
        this.area = lado1 * lado1;
    }

    /**
     * Metodo para hallar el perimetro de un cuadrado
     */
    public void hallarPerimetro() {
        this.perimetro = lado1 * 4;
    }

    public String resultadoOperaciones(){
        String resultado = "El area es: " + area +"\n"+ "El perimetro es: " + perimetro;
        
        return resultado;
    }
    /**
     * Metodo para pintar la figura geometrica
     */
    public void pintar() {


    }

    /**
     * Metodo para mostrar el valor del primer lado 
     * @return lado1 retorna el valor del primer lado
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Metodo para modificar el valor del primer lado
     * @param lado1 valor a modificar del primer lado 
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo para mostrar el valor del segundo lado
     * @return lado2 retorna el valor del segundo lado
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Metodo para modificar el valor del segundo lado
     * @param lado2 valor a modificar del segundo lado
     */

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    /**
     * Metodo para mostrar el valor del area
     * @return area retorna el valor del area 
     */
    public double getArea() {
        return area;
    }

    /**
     * Metodo para modificar el valor del area
     * @param area valor a modificar del area
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * Metodo para mostrar el valor del perimetro
     * @return perimetro retorna el valor del perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * Metodo para modificar el valor del perimetro
     * @param perimetro valor a modificar del perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    /**
     * Metodo para mostrar el valor de X  de la primera coordenada
     * @return coordenada1X retorna el valor de X de la primera coordenda
     */
    
    public double getCoordenada1X() {
        return coordenada1X;
    }
    /**
     * Metodo para modificar el valor de X de la primera coordenda 
     * @param coordenada1X valor a modificar en X de la primera coordenda 
     */
    public void setCoordenada1X(double coordenada1X) {
        this.coordenada1X = coordenada1X;
    }
    /**
     * Metodo para mostrar el valor de Y  de la primera coordenada
     * @return coordenada1Y retorna el valor de Y de la primera coordenda
     */
    public double getCoordenada1Y() {
        return coordenada1Y;
    }
    /**
     * Metodo para modificar el valor de Y de la primera coordenda 
     * @param coordenada1Y valor a modificar en Y  de la primera coordenda
     */
    public void setCoordenada1Y(double coordenada1Y) {
        this.coordenada1Y = coordenada1Y;
    }
    /**
     * Metodo para mostrar el valor de X  de la segunda coordenda
     * @return coordenada2X retorna el valor de X de la segunda coordenda
     */
    public double getCoordenada2X() {
        return coordenada2X;
    }
    /**
     * Metodo para modificar el valor de X de la segunda coordenda 
     * @param coordenada2X valor a modificar en X  de la segunda coordenda
     */
    public void setCoordenada2X(double coordenada2X) {
        this.coordenada2X = coordenada2X;
    }
    /**
     * Metodo para mostrar el valor de Y  de la segunda coordenda
     * @return coordenada2Y  retorna el valor de Y de la segunda coordenda
     */
    public double getCoordenada2Y() {
        return coordenada2Y;
    }
    
    /**
     * Metodo para modificar el valor de Y de la segunda coordenda  
     * @param coordenada2Y valor a modificar en Y  de la segunda coordenda
     */
    public void setCoordenada2Y(double coordenada2Y) {
        this.coordenada2Y = coordenada2Y;
    }
    
    /**
     * Metodo para mostrar el valor de X  de la tercera coordenda
     * @return coordenada3X retorna el valor de X de la tercera coordenda
     */
    public double getCoordenada3X() {
        return coordenada3X; 
    }
    
    /**
     * Metodo para modificar el valor de X de la tercera coordenda  
     * @param coordenada3X valor a modificar en X  de la tercera coordenda
     */
    public void setCoordenada3X(double coordenada3X) {
        this.coordenada3X = coordenada3X;
    }
    /**
     * Metodo para mostrar el valor de Y  de la tercera coordenda
     * @return coordenada3Y retorna el valor de Y de la tercera coordenda
     */

    public double getCoordenada3Y() {
        return coordenada3Y;
    }
    /**
     * Metodo para modificar el valor de X de la tercera coordenda  
     * @param coordenada3Y valor a modificar en Y  de la tercera coordenda
     */

    public void setCoordenada3Y(double coordenada3Y) {
        this.coordenada3Y = coordenada3Y;
    }
    /**
     * Metodo para mostrar el valor de la primera coordenada
     * @return coordenada1 retorna el valor de la primera coordenada
     */
    public String getCoordenada1() {
        return coordenada1;
    }
    /**
     * Metodo para modificar el valor de la primera coordenda
     * @param coordenada1 valor a modificar en la primera coordenda
     */

    public void setCoordenada1(String coordenada1) {
        this.coordenada1 = coordenada1;
    }
    /**
     * Metodo para mostrar el valor de la segunda coordenda
     * @return coordenada2 retorna el valor de la segunda coordenda
     */
    public String getCoordenada2() {
        return coordenada2;
    }
    /**
     * Metodo para modificar el valor de la segunda coordenda
     * @param coordenada2 valor a modificar en la segunda coordenda
     */
    public void setCoordenada2(String coordenada2) {
        this.coordenada2 = coordenada2;
    }
    /**
     * Metodo para mostrar el valor de la tercera coordenda
     * @return coordenda3 retorna el valor de la tercera coordenda
     */
    public String getCoordenada3() {
        return coordenada3;
    }
   /**
     * Metodo para modificar el valor de la tercera coordenda
     * @param coordenada3 valor a modificar en la tercera coordenda
    */
    public void setCoordenada3(String coordenada3) {
        this.coordenada3 = coordenada3;
    }
    /**
     * Metodo para mostrar cual a sido el color que se ha escogido
     * @return color retorna el color seleccionado
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo para modificar el color que se ha seleccionado 
     * @param color modificar el color seleccionado
     */
    public void setColor(String color) {
        this.color = color;
    }

}
