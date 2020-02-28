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

    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;
    private double coordenada1X, coordenada1Y;
    private double coordenada2X, coordenada2Y;
    private double coordenada3X, coordenada3Y;
    private String coordenada1;
    private String coordenada2;
    private String coordenada3;
    private String color;

    //Quitar decimales alas variables doubles
    //DecimalFormat decimales = new DecimalFormat("#.0");
    //pensar si hacer otro constructor para los lados
    public FigurasGeometricas(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y) {
        this.coordenada1X = coordenada1X;
        this.coordenada1Y = coordenada1Y;
        this.coordenada2X = coordenada2X;
        this.coordenada2Y = coordenada2Y;
        this.coordenada3X = coordenada3X;
        this.coordenada3Y = coordenada3Y;

//        System.out.print("1/"+coordenada1X+","+coordenada1Y+"\n");
//        System.out.print("2/"+coordenada2X+","+coordenada2Y+"\n");
//        System.out.print("3/"+coordenada3X+","+coordenada3Y+"\n");
        hallarLado();
    }

    /*public FigurasGeometricas(int lado1) {
     this.lado1 = lado1;
     }*/
    //Recibe las coordenadas en pares , para validar si se puede hacer un triangulo en caso de que si se envia un true
    public boolean verificarCoordenadas() {
        boolean verificar = true;

        if (this.coordenada1X == this.coordenada2X && this.coordenada2Y == this.coordenada3Y) {
            verificar = false;
        }
        return verificar;
    }

    //saca la distancia de un lado 
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

    //Genera los arrays de puntos x y y para graficar un poligono
    public int[] arrayPuntosEnX() {
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

    public void hallarArea() {
        this.area = lado1 * lado1;
    }

    public void hallarPerimetro() {
        this.perimetro = lado1 * 4;
    }

    public String resultadoOperaciones() {
        String resultado = "El area es: " + area + "\n" + "El perimetro es: " + perimetro;

        return resultado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    /**
     *
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getCoordenada1X() {
        return coordenada1X;
    }

    public void setCoordenada1X(double coordenada1X) {
        this.coordenada1X = coordenada1X;
    }

    public double getCoordenada1Y() {
        return coordenada1Y;
    }

    public void setCoordenada1Y(double coordenada1Y) {
        this.coordenada1Y = coordenada1Y;
    }

    public double getCoordenada2X() {
        return coordenada2X;
    }

    public void setCoordenada2X(double coordenada2X) {
        this.coordenada2X = coordenada2X;
    }

    public double getCoordenada2Y() {
        return coordenada2Y;
    }

    public void setCoordenada2Y(double coordenada2Y) {
        this.coordenada2Y = coordenada2Y;
    }

    public double getCoordenada3X() {
        return coordenada3X;
    }

    public void setCoordenada3X(double coordenada3X) {
        this.coordenada3X = coordenada3X;
    }

    public double getCoordenada3Y() {
        return coordenada3Y;
    }

    public void setCoordenada3Y(double coordenada3Y) {
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
