public class Main {
    public static void main(String[] args) {
    Principal principal = new Principal();

    principal.setAluno("Raphael", 19);
    principal.infoAluno(0);
    principal.setEmailAluno(0, "nomesAleatórioph@gmail.com");
    principal.setEndereco(0, "Rodovia Raposo Tavares; Cotia; SP");
    principal.setTelefone(0, 40028922);
    principal.setMatricula(0, 434, 455, 874);



    principal.setAluno("Claudio", 45);
    principal.infoAluno(1);
    principal.setEmailAluno(1, "letrasAleatóriasph@gmail.com");
    principal.setEndereco(1, "Prefeito FLavio Tavares; Vila da Mata; SP");
    principal.setTelefone(1, 996014255);

    principal.setMatricula(1, 466, 489, 274);

    principal.infoCompletaAluno(1);
    }
}
