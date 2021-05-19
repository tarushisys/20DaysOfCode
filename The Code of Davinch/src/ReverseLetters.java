import java.util.*;
public class ReverseLetters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in,rev=" ";

        System.out.println("Enter String: ");
        in = sc.nextLine();
        int length = in.length();

        for(int i=length-1; i>=0; i--){
            rev = rev + in.charAt(i);
        }

        System.out.print("Reversed String: "+rev);
    }
}
