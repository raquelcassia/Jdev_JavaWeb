package classes;

public class Aluno {  /*Classe/Objeto*/	
	
		/*Atributos do Aluno*/
		public String nome;
		public int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCPF;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String seriaMatriculado;
		
	public Aluno() { /*Cria os dados na memoria - Padrão Java*/
		
	} 
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
