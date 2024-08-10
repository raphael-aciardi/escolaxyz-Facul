import java.util.LinkedList;
import java.util.List;

public class Principal {
    List<Aluno> Alunos = new LinkedList<Aluno>();

    public void setAluno(String nome, int idade){
        Aluno novoAluno = new Aluno(nome, idade);
        Alunos.add(novoAluno);
    }

    public void infoAluno(int posicaoDoALuno){
        Aluno alunoSelecionado = Alunos.get(posicaoDoALuno);

        System.out.println(
                "\nO aluno " + alunoSelecionado.getNome() + " possui "
                + alunoSelecionado.getIdade() + " anos\n");
    }

    public void infoCompletaAluno(int posicaoDoALuno){
        Aluno alunoSelecionado = Alunos.get(posicaoDoALuno);

        System.out.println("\n Aluno: " + alunoSelecionado.getNome() +
                "\n Idade: " + alunoSelecionado.getIdade() +
                "\n E-mail: " + alunoSelecionado.getEmail() +
                "\n Endereço: " + alunoSelecionado.getEndereco() +
                "\n Telefone: " + alunoSelecionado.getTelefone() +
                "\n Matrícula: " + alunoSelecionado.getMatricula());

    }

    public void  setEmailAluno(int posicaoDoALuno, String emailAluno){
        System.out.println("O email "+ emailAluno + " foi adicionado para o aluno "
                + Alunos.get(posicaoDoALuno).getNome());
        Alunos.get(posicaoDoALuno).setEmail(emailAluno);
    }

    public void  setEndereco(int posicaoDoALuno, String enderecoAluno){
        System.out.println("O endereço "+ enderecoAluno + " foi adicionado para o aluno "
                + Alunos.get(posicaoDoALuno).getNome());
        Alunos.get(posicaoDoALuno).setEndereco(enderecoAluno);
    }

    public void  setTelefone (int posicaoDoALuno, int telefoneAluno) {
        System.out.println("O telefone " + telefoneAluno + " foi adicionado para o aluno "
                + Alunos.get(posicaoDoALuno).getNome());
        Alunos.get(posicaoDoALuno).setTelefone(telefoneAluno);
    }
    public void  setMatricula (int posicaoDoALuno, int primeiro, int segundo, int terceiro){
        System.out.println("A matrícula " + primeiro + "-" + segundo + "-" + terceiro
                + " foi adicionado para o aluno "
                + Alunos.get(posicaoDoALuno).getNome());
        Alunos.get(posicaoDoALuno).setMatricula(primeiro, segundo, terceiro);
    }


}

