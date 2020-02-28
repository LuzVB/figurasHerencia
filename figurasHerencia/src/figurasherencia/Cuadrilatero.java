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


    /**
     * las variables coordenada4X y coordenada4Y almacenan los valores de  X y Y de la cuarta coordenada
     */
    private double coordenada4X,coordenada4Y;
    /**
     * 
     */
    private String coordenada4;
    /**
     * Constructor que recibe los valores de las cuatro coordendas en X y Y 
     * @param coordenada1X valor de X de la primera coordenda
     * @param coordenada1Y valor de Y de la primera coordenda
     * @param coordenada2X valor de X de la segunda coordenda
     * @param coordenada2Y valor de Y de la segunda coordenda
     * @param coordenada3X valor de X de la tercera coordenda
     * @param coordenada3Y valor de Y de la tercera coordenda
     * @param coordenada4X valor de X de la cuarta coordenda
     * @param coordenada4Y valor de Y de la cuarta coordenda
     */
    public Cuadrilatero(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y,double coordenada4X, double coordenada4Y ) {

        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
        this.coordenada4X = coordenada4X;
        this.coordenada4Y = coordenada4Y;
    }

    //Verificar si es un cuadrado o un rectangulo 
    public boolean verificarCuadrilatero(String tipoCuadrado) {
//        boolean verificarCoord=verificarCoordenadas();
        boolean verificar = false;
        if (tipoCuadrado.equals("Cuadrado")) {
            if(getLado1() == getLado2()){
                System.out.print("Entro al If ladoIgual \n");
                return verificar = true;
            }
            else{
               return verificar = false; 
            }
        } else if (tipoCuadrado.equals("Rectangulo")) {
            if(getLado1() == getLado2()){
                System.out.print("Entro al If ladoIgual \n");
                return verificar = false;
            }
            else{
               return verificar = true; 
            }
        } else {
            return verificar = false;
        }
    }
    /**
     * Metodo que verifica si la figura es un cuadrado un rectangulo
     * @return verificar retorna true si la figura es un cuadrado ó un fal si es un  rectangulo
     */
    public boolean verificarCuadrilatero(){
        boolean verificar=true;
        if(getLado1() == getLado2()){
            return verificar=true;
        }
        else{
            return verificar=false;

        }

//        if(verificarCoord == true){
//            //si son iguales es un Cuadrado
//            if(getLado1() == getLado2() && tipoCuadrado.equals("Cuadrado")){
//                System.out.print("Entro al If VCC \n");
//                return verificar=true;
//            }
//            else if(getLado1() != getLado2() && tipoCuadrado.equals("Rectangulo")){
//                System.out.print("Entro al else \n");
//                return verificar=true;//rectangulo
//            }
//            else{
//                return verificar=false;
//            }
//        }
//        else{
//            return verificar=false;
//        }
    }

    
    /**
     * Metodo para verificar  que no se dibuje un rombo ó un romboide
     * @return verificar devuelve un true si la condicion se cumple
     */

    @Override
    public boolean verificarCoordenadas() {
        boolean verificar = false;

//        if(getCoordenada1Y()== getCoordenada2Y() && getCoordenada2X() == getCoordenada3X() && getCoordenada3Y() == this.coordenada4Y 
//           && this.coordenada4X == getCoordenada1X()){   
//            verificar = true;
//        }
        if (getCoordenada1Y() == getCoordenada2Y() && getCoordenada2X() == getCoordenada3X() && getCoordenada3Y() == this.coordenada4Y && this.coordenada4X == getCoordenada1X()) {
            verificar = true;
            System.out.print("Entro al If VC \n");
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

    /**
     * Metodo para mostrar el valor de X  de la cuarta coordenda
     * @return coordenada4X retorna el valor de X de la cuarta coordenda
     */

    public double getCoordenada4X() {
        return coordenada4X;
    }
    /**
     * Metodo para modificar el valor de X de la cuarta coordenda  
     * @param coordenada4X valor a modificar en X  de la cuarta coordenda
     */
    public void setCoordenada4X(short coordenada4X) {
        this.coordenada4X = coordenada4X;
    }
    /**
     * Metodo para mostrar el valor de Y  de la cuarta coordenda
     * @return retorna el valor de Y de la cuarta coordenda
     */
    public double getCoordenada4Y() {
        return coordenada4Y;
    }
    /**
     * Metodo para modificar el valor de Y de la cuarta coordenda  
     * @param coordenada4Y valor a modificar en Y  de la cuarta coordenda
     */
    public void setCoordenada4Y(short coordenada4Y) {
        this.coordenada4Y = coordenada4Y;
    }
    /**
     * 
     * @return 
     */
    public String getCoordenada4() {
        return coordenada4;
    }
    /**
     * 
     * @param coordenada4 
     */
    public void setCoordenada4(String coordenada4) {
        this.coordenada4 = coordenada4;
    }

}
