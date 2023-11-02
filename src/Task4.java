import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word 1 : ");
        String w1 = sc.nextLine();
        System.out.println("Word 2 : ");
        String w2 = sc.nextLine();
        String temp = w1;
        w1 = w1.concat(w2);
        w2 = w2.concat(temp);
        System.out.println(w1.equals(w2));
    }
}
