import java.util.HashMap;
import java.util.*;
import java.util.Map;
public class FindIndex {
    public static int firstDifferentCharacter(String s){
        Scanner sc = new Scanner(System.in);
        int i,j,count;

        System.out.println("Enter String: ");
        s = sc.next();

        Map<Character, Integer> countMap = new HashMap<>();

        for(i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch,0)+1);
        }

        for(j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            count = countMap.get(ch);
            if(count==1){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = null;
        int index = firstDifferentCharacter(s);
        System.out.println(index);
    }
}
