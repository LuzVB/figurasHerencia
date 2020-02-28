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
public class Rectangulo extends Cuadrilatero {

    public Rectangulo(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y, double coordenada4X, double coordenada4Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y, coordenada4X, coordenada4Y);
    }

    //buscar como hacer para enviar el lado2 del rectangulo 
    /*public Rectangulo(double lado1 , double lado2 ){
     super(lado1);
     this.lado2 = lado2;
     }*/
    @Override
    public void hallarArea() {
        setArea(getLado1() * getLado2());
        System.out.println("el area es " + getArea());
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro((getLado1() * 2) + (getLado2() * 2));
        //System.out.println("el perimetro es " + getDecimales().format(getPerimetro()));
    }

}
