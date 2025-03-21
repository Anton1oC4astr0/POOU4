
package unidad4;

public class Piano extends Instrumento{
    public Piano(){
        super();
    }
    @Override
    public void interpretar(){
        System.out.println("Interpretando el Piano");
        for (int i = 0; i < numNotas; i++){
            switch(nota[i]){
                case DO:
                    System.out.println("Do ");
                    break;
                    case RE:
                    System.out.println("Re ");
                    break;
                    case MI:
                    System.out.println("Mi ");
                    break;
                    case FA:
                    System.out.println("Fa ");
                    break;
                    case SOL:
                    System.out.println("Sol ");
                    break;
                    case LA:
                    System.out.println("La ");
                    break;
                    case SI:
                    System.out.println("Si ");
                    break;
            }
        }
    } 
}
