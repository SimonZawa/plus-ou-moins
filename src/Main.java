import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int nombreChoix = 0;
        System.out.println("Choisis un nombre max :");
        int nombreMax = Integer.valueOf(scanner.nextLine());
        int nombreATrouver = rand.nextInt((nombreMax+1));
        while (nombreChoix!=nombreATrouver){
            System.out.println("Essaye de trouver le nombre, entre 1 et "+ nombreMax+" :");
            nombreChoix = Integer.valueOf(scanner.nextLine());
            if (nombreChoix < nombreATrouver){
                System.out.println("C'est plus !");
            } if (nombreChoix > nombreATrouver) {
                System.out.println("C'est moins !");
            }
        }
        System.out.println("Bravo !");
    }
}