package executavel;

import classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* new Aluno() - � uma instancia (cria��o de objeto) */
		/* aluno1 - variavel que faz referencia ao objeto Aluno */

		Aluno aluno1 = new Aluno();						 /* Aqui ser� o Jo�o */
		aluno1.nome = "Jo�o";
		aluno1.idade = 35;
		
		System.out.println("Nome do aluno � " + aluno1.nome);
		System.out.println("Sua idade � " + aluno1.idade);

		Aluno aluno2 = new Aluno();					 /* Aqui ser� o Pedro */
		Aluno aluno3 = new Aluno(); 				/* Aqui ser� o Alex */
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("Jos�", 50);

	}

}
