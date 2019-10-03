
package atividadeagrecomp;

import java.util.ArrayList;
import java.util.List;
public class Turma 

{
   private String Turma;
   
   
    private List<Alunos> Alunos = new ArrayList<Alunos>();

    public void setTurma(String Turma)
    {
        this.Turma = Turma;
    }
    
    public String getTurma()
    {
        return Turma;
    }
    
    public void addAlunos(Alunos a)
    {
        Alunos.add(a);
    } 

    public void ExibirAlunos()
    {
        System.out.println("Alunos da Turma: " +Alunos);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
