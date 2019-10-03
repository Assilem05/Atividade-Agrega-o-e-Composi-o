
package atividadeagrecomp;
import java.util.ArrayList;
import java.util.List;
public class Escola 
{
    String Nome;
    
    private List<Turma> Turma = new ArrayList<Turma>();
    private String Escola;
    
    public void setEscola(String Escola)
    {
        this.Escola = Escola;
    }
    
    public String getEscola()
    {
        return Escola;
    }
    
    public void ExibirTurmas()
    {
        System.out.println("Turma: " + Turma);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
