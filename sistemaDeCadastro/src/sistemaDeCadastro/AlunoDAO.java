package sistemaDeCadastro;

import java.util.ArrayList;
import java.util.List;
/**
* Classe AlunoDAO responsável por armazenar e gerenciar a lista de alunos cadastrados.
*/
public class AlunoDAO {
// Lista para armazenar os alunos cadastrados
private List<Aluno> alunos;
// Construtor que inicializa a lista de alunos
public AlunoDAO() {
alunos = new ArrayList<>();
}
// Método para adicionar um novo aluno à lista
public void adicionarAluno(Aluno aluno) {
alunos.add(aluno);
}
// Método para retornar a lista de alunos cadastrados
public List<Aluno> listarAlunos() {
return alunos;
}
}