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
    private int coordenada1;
    private int coordenada2;
    private int coordenada3;
    
    
    public FigurasGeometricas() {


    }
   
    
    public  void hallarArea(int lado1){
     this.area = lado1 * lado1 ;
    }
     
    public void hallarPerimetro(int lado1){
     this.perimetro=lado1*4;
    }
    
    public void color (){
        
    }
    public void pintar (){
    
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

    
    
    
   
}
