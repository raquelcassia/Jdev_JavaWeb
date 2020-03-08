package executavel;

import classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* new Aluno() - é uma instancia (criação de objeto) */
		/* aluno1 - variavel que faz referencia ao objeto Aluno */

		Aluno aluno1 = new Aluno();						 /* Aqui será o João */
		aluno1.nome = "João";
		aluno1.idade = 35;
		
		System.out.println("Nome do aluno é " + aluno1.nome);
		System.out.println("Sua idade é " + aluno1.idade);

		Aluno aluno2 = new Aluno();					 /* Aqui será o Pedro */
		Aluno aluno3 = new Aluno(); 				/* Aqui será o Alex */
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("José", 50);

	}

}
