import javax.annotation.processing.SupportedOptions;
import java.util.Random;
public class Luta {
    private Lutadores desafiante;
    private Lutadores desafiado;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }
        else{
            aprovada = false;
        }
    }
    public void lutar(){
        if(aprovada){
            System.out.println("DESAFIANTE:");
            System.out.println("----------------------------------");
            desafiado.apresentar();
            System.out.println("----------------------------------");
            System.out.println("DESAFIADO:");
            desafiante.apresentar();
            System.out.println("----------------------------------");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
            case 0:
            System.out.println("Luta Empatada");
            desafiado.empatarLutas();
            desafiante.empatarLutas();
            break;
            case 1:
            System.out.println("VECENDOR: " + desafiado.getNome());
            desafiado.ganharLuta();
            desafiante.perderLuta();
            break;
            case 2:
            System.out.println("VECENDOR: " + desafiante.getNome());
            desafiante.ganharLuta();
            desafiado.perderLuta();
            break;
            }
        }
        else{
            System.out.println("Luta inválida");
        }
    }
    public void setDesafiado(Lutadores de) {
        this.desafiado = de;
    }
    public Lutadores getDesafiado() {
        return desafiado;
    }
}
