package classes;

import classes.Disciplina;


public class Aluno {

	private String nome;
	private int idade;
	private String dataNasc;
	
	private Disciplina disciplina = new Disciplina();
	
	
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
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


	@Override
	public String toString() {
		return "AlunoMedia [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", disciplina=" + disciplina
				+ "]";
	}

	/* Metodo que retorna a média do aluno */
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2() 
		+ disciplina.getNota3() + disciplina.getNota4()) / 4;
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

}
