package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Discliplina;

import javax.swing.*;


public class PrimeiraClasseJava {
    public static void main(String[] args) {


        //caixinha para dialogo dinamico (JOptionPane.showInputDialog) para usar esse programa de forma dinamica?

        String nome = JOptionPane.showInputDialog(" Qual é o nome do aluno ?");
        String idade = JOptionPane.showInputDialog(" idade do aluno ?");
        String disciplina1 = JOptionPane.showInputDialog("disciplina1");
        String nota1 = JOptionPane.showInputDialog(" Qual é a nota 1 do aluno ?");

        String disciplina2 = JOptionPane.showInputDialog("disciplina2");
        String nota2 = JOptionPane.showInputDialog(" Qual é a nota 2 do aluno ?");

        String disciplina3 = JOptionPane.showInputDialog("disciplina3");
        String nota3 = JOptionPane.showInputDialog(" Qual é a nota 3 do aluno ?");

        String disciplina4 = JOptionPane.showInputDialog("disciplina4");
        String nota4 = JOptionPane.showInputDialog(" Qual é a nota 4 do aluno  ?");

        // construtor de objeto e cria na memoria - instânciar
        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento("29/05/1989");
        aluno1.setRegistrogeral("00.000.000.0");
        aluno1.setNomeMae("Mariaa");
        aluno1.setNumeroCpf("000.000.000.00");
        aluno1.setDataMatricula("01/01/2023");


        // criei um construtor da classe Disciplina na classe aluno e chamei ela aqui dentro
        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);


        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setIdade(31);
        aluno2.setDataNascimento("29/06/1992");
        aluno2.setRegistrogeral("00.010.000.0");
        aluno2.setNomeMae("joaquina");
        aluno2.setNumeroCpf("000.000.000.02");
        aluno2.setDataMatricula("02/05/2023");

        System.out.println(aluno1.toString());
        //System.out.println("o aluno " + aluno1.getNome() + " " + " está " + " " + aluno1.resultadoAluno() + " " + "sua media é " + aluno1.getMediaNota());

        //System.out.println("o aluno " + aluno2.getNome() + " " + " está " + " "+ aluno2.resultadoAluno() + " " + "sua media é " + aluno1.getMediaNota());


    }
}
