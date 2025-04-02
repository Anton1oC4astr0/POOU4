
package unidad4;

public class PruebaFigura{

    public static void main(String[] args){
        Figura f[] = new Figura[3];
        f[0] = new Triangulo(5.5,10.3);
        f[1] = new Circulo(15.6);
        f[2] = new Rectangulo(10.0,5.0);
        for (Figura fig:f){
            fig.dibujar();
            System.out.printf("Área: %.2f\n", fig.calcularArea());
        }
    }
}
