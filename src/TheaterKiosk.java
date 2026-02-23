//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class TheaterKiosk {
    void main() {
        Scanner in = new Scanner(System.in);

        int age;
        String Trash = "";

        System.out.println("Enter your age: ");
        age = in.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a wristband");
        }
    }
}
