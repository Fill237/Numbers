import java.util.Scanner;

public class Nombers2 {

    public static void nom(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        if (a % 7 == 0 && a % 5 != 0){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
