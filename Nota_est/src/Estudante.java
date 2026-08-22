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

    // Insere as 5 notas
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

    // Retorna o nome
    public String getNome() {
        return nome;
    }

    // Retorna as notas
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
    /* Método que recebe um array de estudantes e retorna somente os aprovados*/
    public static Estudante[] aprovados(Estudante[] estudantes) {
        int quantidadeAprovados = 0;
        
        //conta a quantidade de estudantes aprovados
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6.0) {
                quantidadeAprovados++;
            }
        }
        //Se ninguém foi aprovado, retorna null
        if(quantidadeAprovados == 0) {
            return null;
        }

        // Cria um novo array com o tamanho exato da quantidade de aprovados
        Estudante[] aprovados = new Estudante[quantidadeAprovados];
        int posicao = 0;

        // Coloca os aprovados no novo array
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6.0) {
                aprovados[posicao] = estudantes[i];
                posicao++;
            }
        }
        return aprovados;
    }
}