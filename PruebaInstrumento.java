
package unidad4;

public class PruebaInstrumento{

    public static void main(String[] args){
        Campana c = new Campana();
        c.agregarNota(Instrumento.Notas.FA);
        c.agregarNota(Instrumento.Notas.RE);
        c.agregarNota(Instrumento.Notas.SI);
        c.agregarNota(Instrumento.Notas.DO);
        c.agregarNota(Instrumento.Notas.SOL);
        c.interpretar();
        Piano p = new Piano();
        p.agregarNota(Instrumento.Notas.FA);
        p.agregarNota(Instrumento.Notas.RE);
        p.agregarNota(Instrumento.Notas.SI);
        p.agregarNota(Instrumento.Notas.DO);
        p.agregarNota(Instrumento.Notas.SOL);
        p.interpretar();
    } 
}
