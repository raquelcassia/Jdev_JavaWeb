package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");

		String idade = JOptionPane.showInputDialog("Qual sua idade?");
		String dataNasc = JOptionPane.showInputDialog("Qual sua data de nascimento?");
		String disciplina1 = JOptionPane.showInputDialog("Nome da Disciplina 1:");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Nome da Disciplina 2:");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Nome da Disciplina 3:");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3");
		String disciplina4 = JOptionPane.showInputDialog("Nome da Disciplina 4:");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNasc(dataNasc);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		System.out.println(aluno1.toString()); /* Descrição do objeto na memoria */
		System.out.println("Média do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

		
		
	}

}
