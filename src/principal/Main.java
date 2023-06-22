package principal;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Vector<PessoaIMC> pessoas = new Vector<>();

            System.out.print("Digite o número de pessoas:  ");
            int numPessoas = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numPessoas; i++) {
                System.out.print("Digite o tipo de pessoa (H para Homem, M para Mulher): ");
                String tipo = scanner.nextLine();

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a data de nascimento: ");
                String dataNascimento = scanner.nextLine();

                System.out.print("Digite o peso: ");
                double peso = Double.parseDouble(scanner.nextLine());

                System.out.print("Digite a altura: ");
                double altura = Double.parseDouble(scanner.nextLine());

                if (tipo.equalsIgnoreCase("H")) {
                    Homem homem = new Homem(nome, dataNascimento, peso, altura);
                    pessoas.add(homem);
                } else if (tipo.equalsIgnoreCase("M")) {
                    Mulher mulher = new Mulher(nome, dataNascimento, peso, altura);
                    pessoas.add(mulher);
                } else {
                    System.out.println("Tipo de pessoa inválido. Tente novamente.");
                    i--; 
                }
            }

            for (PessoaIMC pessoa : pessoas) {
                System.out.println("\nDados da pessoa:\n" + pessoa);
            }
        }
    }
}
