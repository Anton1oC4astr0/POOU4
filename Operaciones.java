
package unidad4;

public class Operaciones{
    public void imprimirArreglo(int a[]){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public void ordenarArreglo(int a[]){
        int temp;
        for (int i = 0; i <= a.length; i++){
            for (int j = 0; j < a.length-1; j++){
                if (a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
