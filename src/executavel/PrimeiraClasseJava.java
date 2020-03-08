package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual sua idade?");
		String dataNasc = JOptionPane.showInputDialog("Qual sua data de nascimento?");
		
		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNasc(dataNasc);
		
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		

		System.out.println(aluno1.toString()); /* Descrição do objeto na memoria */
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		
	}

}
