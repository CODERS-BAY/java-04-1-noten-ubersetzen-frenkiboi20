import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Note eingeben: ");
        int note = sc.nextInt();

        switch (note) {

            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht genügend");
                break;
            default:
                System.out.println("Keine gültige Note");
        }

        sc.close();
    }
}
