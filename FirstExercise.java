import java.util.Scanner;

public class FirstExercise {

    public boolean sales() {
        Scanner scanner = new Scanner(System.in);
        int[] sale = new int[3];
        for (int i = 0; i < sale.length; i++) {
            System.out.println("Sales" + (i+1) );
            sale[i] = scanner.nextInt();
        }

        int limit = 0;
        while (limit <3){
            if (sale[limit] >= 200){
                System.out.println(sale[limit]);
            }
            limit++;
        }
        return false;
    }

}
