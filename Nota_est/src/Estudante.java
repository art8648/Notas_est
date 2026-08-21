import java.util.Scanner;

public class Estudante {

    // Atributos privados
    private String nome;
    private double[] notas;

    // Construtor
    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }
    // Insere os nomes pelo teclado
    public void insereNome() {
        Scanner teclado = new Scanner(System.in);
            System.out.print("Digite o nome do estudante: ");
            this.nome = teclado.nextLine();
        }

    // Insere as 5 notas pelo teclado
    public void insereNotas() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = teclado.nextDouble();
        }
    }

    // Calcula a média das notas
    public double calculaMedia() {
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }

        return soma / 5;
    }

    // Get para o nome
    public String getNome() {
        return nome;
    }

    // Get para as notas
    public double[] getNotas() {
        return notas;
    }

    // Retorna a menor nota
    public double menorNota() {
        double menor = notas[0];

        for (int i = 1; i < 5; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }
}