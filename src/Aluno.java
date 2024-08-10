public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String endereco;
    private int telefone;
    private String matricula;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public String getMatricula() {
        return this.matricula;
    }


    public void setEmail(String emailDefinido) {
        this.email = emailDefinido;
    }


    public void setEndereco(String enderecoDefinido) {
        this.endereco = enderecoDefinido;
    }

    public void setTelefone(int telefoneDefinido) {
        this.telefone = telefoneDefinido;
    }


    public void setMatricula(int primeiro, int segundo, int terceiro) {
        this.matricula = primeiro + "-" + segundo + "-" + terceiro;
    }

}
