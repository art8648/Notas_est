import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de notas!");

        System.out.print("Quantos estudantes deseja inserir? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        Estudante[] estudantes = new Estudante[quantidade];

        // Loop para inserir os estudantes e suas notas
        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o nome do estudante: ");
            String nome = teclado.nextLine();

            estudantes[i] = new Estudante(nome);
            estudantes[i].insereNotas();
        }

        // Mostra informações de todos os estudantes
        for (Estudante estudante : estudantes) {

            System.out.println("\nNome: " + estudante.getNome());
            System.out.println("Média: " + estudante.calculaMedia());
            System.out.println("Menor nota: " + estudante.menorNota());
        }

        Estudante[] aprovados = Estudante.aprovados(estudantes);

        if (aprovados == null){
            System.out.println("\nNenhum estudante foi aprovado.");
        } else {
            System.out.println("\nEstudantes aprovados:");
            for (Estudante estudante : aprovados) {
                System.out.println(
                    estudante.getNome()+
                    " média: " + estudante.calculaMedia());
            };
        } 
        teclado.close();
    }
}