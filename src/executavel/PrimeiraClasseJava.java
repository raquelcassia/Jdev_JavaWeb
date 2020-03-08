package executavel;

import classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Marcos");
		aluno1.setIdade(16);
		aluno1.setNota1(90);
		aluno1.setNota2(55);
		aluno1.setNota3(40);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome do aluno 1: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Média da nota: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
	}

}
