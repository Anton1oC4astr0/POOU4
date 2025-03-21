
package unidad4;

public abstract class Instrumento{
    public enum Notas{DO,RE,MI,FA,SOL,LA,SI}
    
    protected Notas nota[];
    final int TAM_MAX = 100;
    protected int numNotas;

    public Instrumento(){
        nota = new Notas[TAM_MAX];
        numNotas = 0;
    }
    public void agregarNota(Notas n){
        if (numNotas < nota.length){
            nota[numNotas] = n;
            numNotas++;
        }
    }
    public abstract void interpretar();
}
