
import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um texto para ser feita a verificação de letras 'A': ");
        String texto = scanner.nextLine();
        scanner.close();
        int contadorA = 0;
        int contadora = 0;

        // Loop para verificar cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'A') {
                contadorA++;
            } else if (caractere == 'a') {
                contadora++;
            }
        }

        // Exibir os resultados
        System.out.println("Número de ocorrências de 'A': " + contadorA);
        System.out.println("Número de ocorrências de 'a': " + contadora);
        System.out.println("Número total de ocorrências de 'a' ou 'A': " + (contadorA + contadora));

    }
}
