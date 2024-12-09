import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
        String dataNascimentoString = scanner.nextLine();

        // Convertendo a string da data de nascimento para um objeto LocalDate
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);

        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando a idade
        Period periodo = Period.between(dataNascimento, dataAtual);

        int idade = periodo.getYears();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}
