package executavel;

import classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1997");
		aluno1.setRegistroGeral("123456");
		aluno1.setNumeroCPF("123456789-50");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/10/2019");
		aluno1.setSeriaMatriculado("5");
		aluno1.setNomeEscola("Treinamento");

		System.out.println("Nome do aluno 1 é " + aluno1.getNome());
		System.out.println("idade: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
	
		System.out.println("--------------------------------");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		aluno2.setRegistroGeral("125556");
		aluno2.setNumeroCPF("12345589-50");
		aluno2.setNomeMae("Maria");
		aluno2.setNomePai("Fabio");
		aluno2.setDataMatricula("10/10/2019");
		aluno2.setSeriaMatriculado("5");
		aluno2.setNomeEscola("Treinamento");
		
		
		System.out.println("Nome do aluno 2 é " + aluno2.getNome());
		System.out.println("idade: " + aluno2.getIdade());
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		

	}

}
