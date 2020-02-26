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

        FigurasGeometricas FigurasGeometricas = new FigurasGeometricas();

        Scanner entradaEscaner = new Scanner(System.in);
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
        }

    }

}
