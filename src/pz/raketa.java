package pz;

import java.util.Scanner;

public class raketa {
    public static void main(String[] args) {
        {
            int random = (int) (Math.random() * 10) + 1;
            Scanner scan = new Scanner(System.in);
            int i = 0;
            while (i < 1) {
                System.out.println("ведите код");
                int Number = scan.nextInt();

                if (Number == random) {
                    System.out.println("код верно");
                    break;
                }
                i++;
            }
        }

    }
}