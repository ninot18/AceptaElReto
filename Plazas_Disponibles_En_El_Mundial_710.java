//Problema de Plazas Disponibles en el Mundial (710)
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int ri;
        
        while (cases>0){
            ri = scanner.nextInt() - (scanner.nextInt()+scanner.nextInt()+scanner.nextInt()+scanner.nextInt()+scanner.nextInt()+scanner.nextInt());
            System.out.println(ri);
            cases--;
        }


    }
}
