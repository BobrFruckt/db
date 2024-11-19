package pz;

import java.util.Scanner;

public class sweedon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ведите сумму");
        double moneta = scan.nextDouble();
        if (moneta < 18800) {
            double moneta1 = moneta - moneta * 0.11;
            System.out.println("деньга посчитана с налогом " + moneta1);
        }
        if (moneta >= 18800 && moneta < 468700) {
            double moneta2 = moneta - moneta * 0.20;
            System.out.println("деньга посчитана с налогом " + moneta2);
        }
        if (moneta >= 468700 && moneta < 675700) {
            double moneta3 = moneta - moneta * 0.32;
            System.out.println("деньга посчитана с налогом " + moneta3);
        }
        if (moneta >= 675700) {
            double moneta4 = moneta - moneta * 0.40;
            System.out.println("деньга посчитана с налогом " + moneta4);
        }
    }
}
