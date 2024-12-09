import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero:");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero:");
        int numero5 = scanner.nextInt();

        int[] vetor = {numero1, numero2, numero3, numero4, numero5};

        System.out.println("Imprimindo com For:");
        for (int index = 0; index < vetor.length; index++) {
            System.out.println(vetor[index]);
        }
        System.out.println("Imprimindo com While:");
        int i = 0;
        while (i < vetor.length) {
            System.out.println(vetor[i]);
            i++;
        }
        System.out.println("Imprimindo com Do/While:");
        i = 0;
        do {
            System.out.println(vetor[i]);
            i++;
        } while (i < vetor.length);
    }
}