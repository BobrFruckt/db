package pz;

public class trata {
    public static void main(String[] args)
    {
        int[] areay1 = new int[7];
        int sym = 0;
        for (int i = 0; i < areay1.length; i++) {
            int random = (int) (Math.random() * 5000 + 2000) + 1;
            areay1[i] = random;
        }
        for (int i = 0; i < areay1.length; i++) {
            sym += areay1[i];
            System.out.println(areay1[i]);
        }
        System.out.println("Сумма затрат: " + sym);
    }
}
