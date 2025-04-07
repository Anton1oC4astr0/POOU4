
package pruebareutilizable;

public class PruebaReutilizable{

    public static void main(String[] args){
        int arr[]={100,23,52,4};
        unidad4.Operaciones o = new unidad4.Operaciones();
        System.out.println("Arreglo desordenado");
        o.imprimirArreglo(arr);
        o.ordenarArreglo(arr);
        System.out.println("Arreglo ordenado");
        o.imprimirArreglo(arr);
    }
}
