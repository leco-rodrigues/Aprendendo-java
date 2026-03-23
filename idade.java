import java.util.Scanner;

public class idade {
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual sua idade?");
        String idade = scanner.nextLine();
        
        System.out.println("Você tem " + idade + " anos!");
    }
}
