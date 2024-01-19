//Ejercicio de Palabras Pentavocalicas (300)

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        String regex = "^(?=.*a)(?=.*e)(?=.*i)(?=.*o)(?=.*u).*$";

        for (int i=0; i<=cases; i++){
            String isPentaVowal = scanner.nextLine();
            if (!isPentaVowal.isEmpty()) {
                if (isPentaVowal.matches(regex)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}
