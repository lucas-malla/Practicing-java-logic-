import java.util.Scanner;

public class AskForUserNumber {
    public int addNumber() {
        Scanner sc = new Scanner(System.in);

        int option = 1;
        int number = 0;

        while (option != 2) {
            System.out.println("Enter a number");
            number = sc.nextInt();

            System.out.println("Want to continue ? 1=YES / 2=NOT");
            option = sc.nextInt();

        }
        return option;
    }
}