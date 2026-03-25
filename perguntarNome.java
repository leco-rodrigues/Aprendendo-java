import java.util.Scanner;

public class perguntarNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        boolean validName = false;

        do {
            System.out.println("Qual o seu nome?");
            nome = scanner.nextLine();

            if(nome != null && !(nome.trim().isEmpty()) && nome.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+")) {
                validName = true;
                break;
            }

            System.out.println("-----");
            System.out.println("Por favor, digite um nome válido.");
            System.out.println("-----");

        } while(!validName);

        System.out.println("Seu nome é " + nome + "!");
    }
}
