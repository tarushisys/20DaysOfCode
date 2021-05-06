import java.util.*;
public class CodeOfDavinch2 {
    public static void main(String[] args){
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = sc.next();

        if(word.startsWith("dav") && word.endsWith("chi") && word.contains("in")){
            System.out.println("Code Acccepted");
            }
        else{
            System.out.println("Access Denied");
        }
        }
}
