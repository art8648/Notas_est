public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante("");

        estudante.insereNotas();
        estudante.insereNome();

        System.out.println("Aluno: " + estudante.getNome());
        System.out.println("Média: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}