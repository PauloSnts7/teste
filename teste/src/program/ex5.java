package program;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a string para inverter: ");
        String input = scanner.nextLine();

        
        scanner.close();
        String reversed = inverterString(input);
        System.out.println("String invertida: " + reversed);
    }

    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray(); 
        int inicio = 0;
        int fim = caracteres.length - 1;

        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

    
        return new String(caracteres);
    }
}
