import java.util.Scanner;
public class Hallo {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihren Namen ein:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hallo " + name + ", willkommen!");
    }
}
