package sistemaDeCadastro;

public class Aluno {
	private static int contadorMatricula = 1000; // Contador estático para gerar matrícula automática
	private String nome;
	private String matricula;
	private String curso;
	private String cpf; // Novo atributo CPF
	private boolean cursoAtivo;
	private boolean cursoTrancado;
	// Construtor padrão
	public Aluno(String nome, String cpf, String curso) throws IllegalArgumentException {
	this.nome = nome;
	this.matricula = gerarMatricula(); // Gera a matrícula automaticamente
	this.curso = curso; 
	setCpf(cpf); // Valida e define o CPF
	this.cursoAtivo = true; // O curso começa como ativo
	this.cursoTrancado = false; // O curso não está trancado
	}
	// Método para gerar a matrícula automaticamente
	private String gerarMatricula() {
	return String.valueOf(contadorMatricula++);
	}
	// Validação do CPF: deve ter exatamente 11 caracteres
	public void setCpf(String cpf) throws IllegalArgumentException {
	if (cpf.length() != 11 || !cpf.matches("\\d+")) {
	throw new IllegalArgumentException("O CPF deve conter exatamente 14 dígitos numéricos.");
	}
	this.cpf = cpf;
	}
	public String getCpf() {
	return cpf;
	}
	public String getNome() {
	return nome;
	}
	public String getMatricula() {
	return matricula;
	}
	public String getCurso() {
	return curso;
	}
	public boolean isCursoAtivo() {
	return cursoAtivo;
	}
	public void ativarCurso() {
	this.cursoAtivo = true;
	this.cursoTrancado = false;
	}

	public boolean isCursoTrancado() {
	return cursoTrancado;
	}
	public void trancarCurso() {
	this.cursoTrancado = true;
	this.cursoAtivo = false;
	}
	@Override
	public String toString() {
	String statusCurso = cursoAtivo ? "Ativo" : cursoTrancado ? "Trancado" : "Indefinido";
	return "Aluno [Nome: " + nome + ", Matrícula: " + matricula + ", CPF: " + cpf + ", Curso: " + curso
	+ ", Status do Curso: " + statusCurso + "]";
	}

}
