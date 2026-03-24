import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String idade;
        boolean isNumeric = false;

        // Passo 1: Solicitar idade
        do {
            System.out.println("Qual sua idade?");
            idade = scanner.nextLine();

        // Passo 2: Validar entrada
            try {
                Integer.parseInt(idade);

                if(Integer.parseInt(idade) >= 1 && Integer.parseInt(idade) <= 116) {
                    isNumeric = true;
                    break;
                }

                System.out.println("-----");
                System.out.println("Por favor, insira uma idade válida (1 à 116).");
                System.out.println("-----");

            } catch(Exception e) {
                System.out.println("-----");
                System.out.println("Por favor, insira uma idade válida (apenas números).");
                System.out.println("-----");
            }

        } while(!isNumeric);

        // Passo 3: Exibir resultado
        System.out.println("-----");
        System.out.println("Você tem " + idade + " anos!");
        System.out.println("-----");
    }
}
