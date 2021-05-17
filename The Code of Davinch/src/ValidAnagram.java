import java.util.*;
public class ValidAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if(checkAnagram(s,t)){
            System.out.println(s + " and " + t + " are anagrams");
        }
        else{
            System.out.println(s + " and " + t + " are not anagrams");
        }
    }

    public static boolean checkAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        else{
            char[] arr1 = s.toLowerCase().toCharArray();
            char[] arr2 = t.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return (Arrays.equals(arr1,arr2));
        }
    }
}
