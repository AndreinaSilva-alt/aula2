 class Aluno {

        String nome;
        String dataDeNascimento;
        int idade;
    }

    public class Main{
        public static void main(String[] args){
             Aluno aluno = new Aluno();

             aluno.nome = "Kamila";
             aluno.dataDeNascimento = "13/07/2004";
             aluno.idade = 21;

             System.out.println("A aluna é "+ aluno.nome + " que nasceu em " + aluno.dataDeNascimento +  " tem " + aluno.idade + " anos.") ;
        }
    }



