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
public class Triangulo extends FigurasGeometricas {

    private double lado3;
    private String tipoTriangulo;

    public Triangulo(double coordenada1X, double coordenada1Y, double coordenada2X, double coordenada2Y, double coordenada3X, double coordenada3Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
    }

    @Override
    public void hallarLado() {
        double raiz, raiz2;
        double potencia1, potencia2;

        potencia1 = Math.pow((getCoordenada2X() - getCoordenada1X()), 2);
        potencia2 = Math.pow((getCoordenada2Y() - getCoordenada1Y()), 2);
        raiz = Math.sqrt(potencia1 + potencia2);

        setLado1(raiz);

        potencia1 = Math.pow((getCoordenada3X() - getCoordenada2X()), 2);
        potencia2 = Math.pow((getCoordenada3Y() - getCoordenada2Y()), 2);
        raiz = Math.sqrt(potencia1 + potencia2);

        setLado2(raiz);

        potencia1 = Math.pow((getCoordenada1X() - getCoordenada3X()), 2);
        potencia2 = Math.pow((getCoordenada1Y() - getCoordenada3Y()), 2);
        raiz = Math.sqrt(potencia1 + potencia2);

        this.lado3 = raiz;
    }

    public void hallarTipoTriangulo() {
        if (getLado1() == getLado2() && getLado1() == this.lado3) {
            tipoTriangulo = "Equilatero";
        } else if (getLado1() == getLado2() || getLado1() == this.lado3 || getLado2() == this.lado3) {
            tipoTriangulo = "Isosceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
    }

    //hallar el area con la formula de Heron
    @Override
    public void hallarArea() {
        double semiPerimetro;
        double raiz;
//        double ladoA,ladoB,ladoC;
//        ladoA = 3;
//        ladoB = 4;
//        ladoC = 5;
        semiPerimetro = (getLado1() + getLado2() + this.lado3) / 2;

//        raiz = Math.sqrt(semiPerimetro * ((semiPerimetro - getLado1()) * (semiPerimetro - getLado2()) * (semiPerimetro - this.lado3)));
        raiz = Math.sqrt((semiPerimetro*(semiPerimetro-getLado1()))*(semiPerimetro-getLado2())*(semiPerimetro-this.lado3));

//        System.out.print("semiPerimetro " + semiPerimetro);
//        System.out.print("raiz " + raiz);

        setArea(raiz);
    }

    @Override
    public void hallarPerimetro() {
        hallarTipoTriangulo();
        if (tipoTriangulo.equals("Equilatero")) {
            setPerimetro(getLado1() * 3);
        } else if (tipoTriangulo.equals("Isosceles")) {
            if (getLado1() == getLado2()) {
                setPerimetro((getLado1() * 2) + this.lado3);
            } else if (getLado1() == this.lado3) {
                setPerimetro((getLado1() * 2) + getLado2());
            } else {
                setPerimetro((getLado2() * 2) + getLado1());
            }
        } else {
            setPerimetro(getLado2() + getLado1() + this.lado3);
        }
    }
    
    @Override
    public String resultadoOperaciones(){
        String resultado = "El area es: " + getArea() + "\n"+"El perimetro es: " + getPerimetro() +"\n"+"El tipo de triangulo es: "+tipoTriangulo;
        
        return resultado;
    }


    /* public Triangulo(double lado1 , double lado2 , double lado3){
     super(lado1);
     this.lado2 = lado2;
     this.lado3 = lado3;
     }*/
    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

}
