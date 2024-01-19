//Problema de Antrópodos (293)

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int insect = scanner.nextInt();
            int spider = scanner.nextInt();
            int crustacean = scanner.nextInt(); 
            int scolopendra = scanner.nextInt();
            int rings = scanner.nextInt();

            int legs = (insect * 6) + (spider * 8) + (crustacean * 10) + (scolopendra * rings * 2);
            System.out.println(legs);
        }

        scanner.close();

    }
}
