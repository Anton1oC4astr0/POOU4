
package unidad4;

public class PruebaOp{

    public static void main(String[] args){
        Operaciones op = new Operaciones ();
        int arreglo [] = {5,23,10,12,2,8};
        System.out.println("Arreglo desordenado");
        op.imprimirArreglo(arreglo);
        op.ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado");
        op.imprimirArreglo(arreglo);
    } 
}
