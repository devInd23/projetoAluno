package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;


public class PrimeiraClasseJava {
    public static void main(String[] args) {


        //caixinha para dialogo dinamico (JOptionPane.showInputDialog) para usar esse programa de forma dinamica?

        String nome = JOptionPane.showInputDialog(" Qual é o nome do aluno ?");
        String idade = JOptionPane.showInputDialog(" idade do aluno ?");
        String nota1 = JOptionPane.showInputDialog(" Qual é a nota 1 do aluno ?");
        String nota2 = JOptionPane.showInputDialog(" Qual é anota 2 do aluno ?");
        String nota3 = JOptionPane.showInputDialog(" Qual é a nota 3 do aluno ?");
        String nota4 = JOptionPane.showInputDialog(" Qual é a nota 4 do aluno ? ?");
        // construtor de objeto e cria na memoria - instânciar
        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento("29/05/1989");
        aluno1.setRegistrogeral("00.000.000.0");
        aluno1.setNomeMae("Maria");
        aluno1.setNumeroCpf("000.000.000.00");
        aluno1.setDataMatricula("01/01/2023");
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));


        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setIdade(31);
        aluno2.setDataNascimento("29/06/1992");
        aluno2.setRegistrogeral("00.010.000.0");
        aluno2.setNomeMae("joaquina");
        aluno2.setNumeroCpf("000.000.000.02");
        aluno2.setDataMatricula("02/05/2023");
        aluno2.setNota1(90);
        aluno2.setNota2(80.8);
        aluno2.setNota3(70.9);
        aluno2.setNota4(90.7);
        System.out.println(aluno1);
        System.out.println("o aluno " + aluno1.getNome() + " " + " está " + " " + aluno1.resultadoAluno() + " " + "sua media é " + aluno1.getMediaNota());

        //System.out.println("o aluno " + aluno2.getNome() + " " + " está " + " "+ aluno2.resultadoAluno() + " " + "sua media é " + aluno1.getMediaNota());


    }
}
