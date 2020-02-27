/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

import java.util.Scanner;

/**
 *
 * @author Luz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      new Ventana().setVisible(true);
//       FigurasGeometricas FigurasGeometricas = new FigurasGeometricas(1,0,5,0,5,4);
//       //FigurasGeometricas.hallarLado();
//       System.out.print(FigurasGeometricas.getLado1()+"\n");
//       System.out.print(FigurasGeometricas.getLado2());
        
       Triangulo FigurasGeometricas = new Triangulo(0,0,4,0,2,3.4);
       Rectangulo  Rectangulo= new Rectangulo(2,-2,13,-2,8,3,2,2);
       
       FigurasGeometricas.hallarTipoTriangulo();
       FigurasGeometricas.hallarArea();
       Rectangulo.hallarPerimetro();
       Rectangulo.hallarArea();
       //FigurasGeometricas.hallarLado();
       System.out.println(FigurasGeometricas.getLado1()+"LADO1\n");
       System.out.println(FigurasGeometricas.getLado2()+"LADO2\n");
       System.out.println(FigurasGeometricas.getLado3());
       System.out.println(FigurasGeometricas.getTipoTriangulo());
       System.out.print("OTRO"+Rectangulo.getPerimetro()+ "\n");
       

       
    /*
        Scanner entradaEscaner = new Scanner(System.in);
=======
       /*new Ventana().setVisible(true);*/


        /*Scanner entradaEscaner = new Scanner(System.in);
>>>>>>> Stashed changes
        System.out.print("BIENVENIDO \n");
        System.out.print("Seleccione el tipo de figura: \n");
        System.out.print("1.Cuadrado \n");
        System.out.print("2.Rectangulo \n");
        System.out.print("3.Triangulo \n");
        byte tipoFigura = entradaEscaner.nextByte();

        switch (tipoFigura) {
            case 1:

                System.out.println("Ingrese el valor del lado ");
                int lado1 = entradaEscaner.nextInt();
                FigurasGeometricas.hallarArea(lado1);
                FigurasGeometricas.hallarPerimetro(lado1);
                System.out.println("El valor del area es: \n" + FigurasGeometricas.getArea());
                System.out.println("El valor del perimetro es :\n" + FigurasGeometricas.getPerimetro());
                break;
            case 2:
                break;
            case 3:
                break;
        }*/

    }

}
