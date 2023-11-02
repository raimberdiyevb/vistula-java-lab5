import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word 1 : ");
        String w1 = sc.nextLine();
        w1 = w1.toLowerCase();
        System.out.println(isPalindrome(w1));
    }
    public static boolean isPalindrome(String w){
        int l = 0;
        int r = w.length()-1;
        while(l <= r){
            if(w.charAt(l) != w.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
