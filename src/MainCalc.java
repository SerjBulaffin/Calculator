import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        AnalizierString analizierString = new AnalizierString(input);
        System.out.println(analizierString.returnResult());
    }
}
