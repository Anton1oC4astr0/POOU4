
package unidad4;

public class Circulo extends Figura{
private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    void dibujar(){
        System.out.println("Dibujando un circulo");
    }

    @Override
    double calcularArea(){
        return Math.PI*radio*radio;
    }
}
