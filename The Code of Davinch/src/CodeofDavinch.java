import java.util.Scanner;
public class CodeofDavinch {
    public static void main(String[] args){
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        word = sc.next();

        if(word.startsWith("dav")){
            if(word.endsWith("chi")){
                System.out.println("Correct code");
            }
            else{
                System.out.println("Access Denied");
            }
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
