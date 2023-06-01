public class Count {
    public static void main(String[] args) {
        int i = 0;
        int j = 87;

        while (i <= j) {
            System.out.println("Wert von i: " + i + ", Wert von j: " + j);
            i++;
            j -= 3;
        }
        System.out.println("Programm ist beendet. Der Endwert von i ist " + i + " und der Endwert von j " + j + ".");
    }
}