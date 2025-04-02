
package unidad4;

import java.util.ArrayList;
import java.util.List;

public class PruebaFruta{
    private List canasta = new ArrayList();
    public static void main(String[] args){
        /*Manzana m = new Manzana("Verde");
        System.out.println(m instanceof Manzana);
        System.out.println(m instanceof Fruta);*/
        System.out.println("Favor de introducir solo fruta en la canasta");
        Manzana m1 = new Manzana("Manzana Roja");
        Manzana m2 = new Manzana("Manzana Golden");
        Manzana m3 = new Manzana("Manzana Amarilla");
        Guayaba g = new Guayaba("Guayaba Roja");
        Pera p = new Pera("Pera de mantequilla");
        Galleta g1 = new Galleta("Emperador de limón");
        PruebaFruta pf = new PruebaFruta();
        pf.verificar(m1);
        pf.verificar(m2);
        pf.verificar(m3);
        pf.verificar(g);
        pf.verificar(p);
        pf.verificar(g1);
    }
    private void verificar(Object obj){
        if (obj instanceof Fruta){
            canasta.add(obj);
            System.out.println("Fruta agregada: " + ((Fruta)obj).getNombre());
        }else{
            System.out.println("El objeto NO es una fruta");
        }
    }
}
