import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Integer a = scr.nextInt();
        if (a % 7 == 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
