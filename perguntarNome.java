import java.util.Scanner;

public class perguntarNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        do {
            System.out.println("Qual o seu nome?");
            nome = scanner.nextLine();
        } while(nome == null || nome.isEmpty());

        System.out.println("Seu nome é " + nome + "!");
    }
}
