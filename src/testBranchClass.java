import java.util.Scanner;

public class testBranchClass {

    public static void test(String[] args) {
        Scanner scr = new Scanner(System.in);
        Integer a = scr.nextInt();
        if (a % 10 == 0) {
            System.out.println("aaaaaaa");
        } else
            System.out.println("NO");
    }
}