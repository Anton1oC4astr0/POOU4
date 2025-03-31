
package unidad4;

public class PruebaFigura{

    public static void main(String[] args){
        Figura f[] = new Figura[3];
        f[0] = new Triangulo();
        f[1] = new Circulo();
        f[2] = new Rectangulo();
        for (Figura fig:f){
            fig.dibujar();
        }
    }
}
