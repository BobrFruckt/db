package pz;
import java.util.Scanner;
public class prilozhenya {
    public static void main (String[] args)
    {
        double creditPay = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("укажите сумму кредита:");
        double credit = scanner.nextDouble();
        double credit1 = credit + credit * 0.25;
        double credit2 = credit1;
        double oneYears = 12;
        while (true) {
            while (true) {
                System.out.println("выберете опцию:");
                System.out.println("1# Внести платёж за месяц;");
                System.out.println("2# Сколько внесено");
                System.out.println("3# Сколько осталось заплатить;");
                System.out.println("4# Сколько месяцев осталось платить;");
                System.out.println("5# Переплата за кредит;");
                System.out.println("6# Отмена");
                int number = scanner.nextInt();
                if (number == 1) {
                    System.out.println("Внеcите платёж:");
                    double pay = scanner.nextDouble();
                    creditPay += pay;
                    credit2 -= pay;
                    oneYears--;
                    break;
                }
                if (number == 2) {
                    System.out.println("Уже внесено: " + creditPay);
                    break;
                }
                if (number == 3) {
                    if (credit1 <= creditPay ) {
                        System.out.println("Кредит выплачен.");
                        break;
                    }
                    System.out.println("Осталось заплатить: " + credit2);
                    break;
                }
                if (number == 4) {
                    double overpayment = creditPay - credit1;
                    if (overpayment > 0) {
                        System.out.println("Вы выплатили свой кредит.");
                        break;
                    }
                    System.out.println("Месяцев осталось платить: " + oneYears);
                    break;
                }
                if (number == 5) {
                    double overpayment = creditPay - credit1;
                    if (overpayment > 0) {
                        System.out.println("Вы переплатили за кредит на: " + overpayment);
                        break;
                    }
                    System.out.println("Вы не переплатили за кредит.");
                    break;
                }
                if (number == 6) {
                    return;
                }
                System.out.println("Неверно вписано число, попробуйте ещё раз.");
            }
        }
    }
}