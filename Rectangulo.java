
package unidad4;

public class Rectangulo extends Figura{    
private double b, h;

    public Rectangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public double getH(){
        return h;
    }

    public void setH(double h){
        this.h = h;
    }
    @Override
    void dibujar(){
        System.out.println("Dibujando un rectangulo");
    }

    @Override
    double calcularArea(){
        return b*h;
    }
    
}
