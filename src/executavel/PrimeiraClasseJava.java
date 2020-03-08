package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
	
		  String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		
		String idade = JOptionPane.showInputDialog("Qual sua idade?");
		String dataNasc = JOptionPane.showInputDialog("Qual sua data de nascimento?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

		Aluno aluno1 = new Aluno();
		 
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));   		
		aluno1.setDataNasc(dataNasc);
		aluno1.setNota1(Double.parseDouble(nota1));		
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println(aluno1.toString());   /* Descrição do objeto na memoria*/
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		

		
		/*System.out.println("Nome do aluno 1: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data de Nascimento: " + aluno1.getDataNasc());
		System.out.println("Média da nota: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); */
		

		
	}

}

