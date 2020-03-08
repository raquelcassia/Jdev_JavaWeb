package classes;

public class Aluno {

	private String nome;
	private int idade;
	private String dataNasc;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/* Metodo que retorna a média do aluno */
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
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

