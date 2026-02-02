package Day_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = a;

        while (i + 1 < b) {

            if (i % 5 == 0  && i % 10 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
