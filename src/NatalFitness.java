import java.util.Calendar;
import java.util.Date;

public class NatalFitness {
    public static void main(String [] args){

        Calendar cal = Calendar.getInstance();

        //Criando os funcionarios
        Funcionario bernado = new Gerente(001,"Bernado",5000.00);
        Funcionario popeye = new Professor(002,"Popeye","Musculação");
        Funcionario phelps = new Professor(003,"Popeye","Natação");
        Funcionario arnold = new Professor(004,"Arnold","Musculação");

        //Criando os alunos
        Aluno neymar = new Aluno ("Neymar","584.659.745-62",new Date(26/02/1993));
        Aluno marta = new Aluno ("Marta","234.897.954-78",new Date(15/03/1987));
        Aluno bruninho = new Aluno ("Bruninho do Volei","345.234.954-13",new Date(28/04/1987));

        //Criando os treinos para cada aluno
        neymar.addTreino(new Treino("Hipertrofia","10:00"));
        neymar.addTreino(new Treino("Ergometria","11:00"));

        marta.addTreino(new Treino("Nado de Costa", "08:00"));
        marta.addTreino(new Treino("Nado Livre", "07:00"));
        marta.addTreino(new Treino("Nado Borboleta", "09:00"));

        bruninho.addTreino(new Treino("Hipertrofia", "11:00"));
        bruninho.addTreino(new Treino("Ergometria", "07:00"));

        //Vinculando os alunos a cada professor
        ((Professor)popeye).addAluno(neymar);
        ((Professor)phelps).addAluno(marta);
        ((Professor)arnold).addAluno(bruninho);



    }
}
