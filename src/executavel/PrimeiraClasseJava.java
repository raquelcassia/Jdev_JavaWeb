package executavel;

import classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		
		/*Equals e HashCode - Diferenciar Objetos*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setIdade(25);
		
		

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setIdade(255);
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		}else {
			System.out.println("Alunos diferentes.");
		}
		
		

	}

}
