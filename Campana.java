
package unidad4;

public class Campana extends Instrumento{

    public Campana(){
        super();
    }
    @Override
    public void interpretar(){
        System.out.println("Interpretando la Campana");
        for (int i = 0; i < numNotas; i++){
            switch(nota[i]){
                case DO:
                    System.out.println("Doooooo");
                    break;
                    case RE:
                    System.out.println("Reeeeee");
                    break;
                    case MI:
                    System.out.println("Mimimimi");
                    break;
                    case FA:
                    System.out.println("Faaaaaaa");
                    break;
                    case SOL:
                    System.out.println("Sooooool");
                    break;
                    case LA:
                    System.out.println("Laaaaaaa");
                    break;
                    case SI:
                    System.out.println("Siiiiiiii");
                    break;
            }
        }
    } 
}
