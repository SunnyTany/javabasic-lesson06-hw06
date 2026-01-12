package app;

public class Main {
    public static void main(String[] args) {
        byte sum = 0;
        for (byte i = 1; i <= 6; i++) {
            sum += i;
            System.out.println( i + ") Num is " + i + ", sum is " + sum);
        }
    }
}
