import br.com.dev.escola.aluno.AlunoRepositoryEmMemoria;
import br.com.dev.escola.aluno.MatricularAluno;
import br.com.dev.escola.aluno.MatricularAlunoDto;

public class InicializarApp {

    public static void main(String[] args) {
        MatricularAluno matriluarAluno = new MatricularAluno(new AlunoRepositoryEmMemoria());

        matriluarAluno.matricular( new MatricularAlunoDto("alan jhone",
                "111.111.111-11",
                "alan@email.com"));

        matriluarAluno.matricular( new MatricularAlunoDto("joaozinho",
                "222.222.222-22",
                "joaozinho@email.com"));

        matriluarAluno.buscarAlunosMatricular().forEach(a -> System.out.println(a.getNome()));

    }

}
