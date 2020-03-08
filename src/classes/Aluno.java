package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String dataNasc;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	public Aluno() {

	}
	

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "AlunoMedia [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + "]";
	}

	/* Metodo que retorna a média do aluno */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size(); /*retorna qnts objts tem na lista*/
	}

	
	/* Metodo que retorna true para Aprovado e false para Reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >=70) {
			return true;
		}else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno está Aprovado";
		} else {
			return "Aluno está Reprovado";
		}
	}

	public void setIdade(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}

}