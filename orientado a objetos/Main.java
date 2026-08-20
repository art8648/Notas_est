public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante("Arthur");

        estudante.insereNotas();

        System.out.println("Aluno: " + estudante.getNome());
        System.out.println("Média: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}