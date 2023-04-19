package cursojava.classes;

// esta e a classe obejeto que faz referencia ao aluno
// os atributos dessa classe por defult estao em private para manter o encapsulamento e segurança dos dados,
// para outras classes terem acesso aos valores do metodos private , tem que usar os metodos SETTERS e GETTERS.
//Um setter é um método que permite modificar o valor de uma variável privada. Geralmente, os setters têm um parâmetro que especifica o novo valor da variável, e eles não retornam nenhum valor. Eles geralmente têm um nome que começa com "set", seguido pelo nome da variável, por exemplo, "setNome".
// Um getter é um método que permite acessar o valor de uma variável privada. Geralmente, os getters não têm parâmetros e retornam o valor da variável. Eles geralmente têm um nome que começa com "get", seguido pelo nome da variável, por exemplo, "getNome".
//Em resumo, setters são usados para definir o valor de uma variável privada, enquanto getters são usados para obter o valor de uma variável privada. Esses métodos permitem que as variáveis privadas sejam acessadas e modificadas com segurança, mantendo a encapsulação e a proteção dos dados.

import java.util.Objects;

public class Aluno {

      private  String nome;
      private  int idade;
      private  String dataNascimento;
      private  String registrogeral;
      private  String numeroCpf;
      private  String nomeMae;
      private  String dataMatricula;
      private double nota1;
      private double nota2;
      private double nota3;
      private double nota4;

      public double getNota1() {
          return nota1;
      }

      public void setNota1(double nota1) {
          this.nota1 = nota1;
      }

      public double getNota2() {
          return nota2;
      }

      public void setNota2(double nota2) {
          this.nota2 = nota2;
      }

      public double getNota3() {
          return nota3;
      }

      public void setNota3(double nota3) {
          this.nota3 = nota3;
      }

      public double getNota4() {
          return nota4;
      }

      public void setNota4(double nota4) {
          this.nota4 = nota4;
      }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public int getIdade() {
          return idade;
      }

      public void setIdade(int idade) {
          this.idade = idade;
      }

      public String getDataNascimento() {
          return dataNascimento;
      }

      public void setDataNascimento(String dataNascimento) {
          this.dataNascimento = dataNascimento;
      }

      public String getRegistrogeral() {
          return registrogeral;
      }

      public void setRegistrogeral(String registrogeral) {
          this.registrogeral = registrogeral;
      }

      public String getNumeroCpf() {
          return numeroCpf;
      }

      public void setNumeroCpf(String numeroCpf) {
          this.numeroCpf = numeroCpf;
      }

      public String getNomeMae() {
          return nomeMae;
      }

      public void setNomeMae(String nomeMae) {
          this.nomeMae = nomeMae;
      }

      public String getDataMatricula() {
          return dataMatricula;
      }

      public void setDataMatricula(String dataMatricula) {
          this.dataMatricula = dataMatricula;
      }

      public double getMediaNota() {
          return ( nota1 + nota2 + nota3 + nota4 ) / 4 ;
      }

                   //criação de um modelo de um metodo que retorna uma String, porque criamos ele como String.
      public String resultadoAluno() {
          double media = this.getMediaNota();
          if (media >= 70) {
             return "aprovado";
          }else  {
             return "reprovado";
          }

      }
      //Equals e Hascode , metodos no java para diferenciar e comparar um objeto de outro


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return getNome().equals(aluno.getNome()) && getNumeroCpf().equals(aluno.getNumeroCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroCpf());
    }
}

