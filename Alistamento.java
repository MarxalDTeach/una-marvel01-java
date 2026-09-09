import java.util.Scanner;
public class Alistamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Alistamento ===");
        System.out.println("\nDigite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite seu peso(KG): ");
        double peso = scanner.nextDouble();

        if (peso < 10) {
            System.out.println("\n" + nome + ", você esta desnutrido.");
        } else if (peso < 50) {
            System.out.println("\n" + nome + ", você esta n esta apto.");
        } else {
            System.out.println("\n" + nome + ", você está apto para o alistamento.");
        }
        scanner.close();
    }
}
