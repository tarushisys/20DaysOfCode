import java.util.*;
import java.math.*;
public class PageNumber {
    static int pageCount(int n, int p){
        int totalPageCount = n/2;
        int targetPage = p/2;
        int targetBack = totalPageCount - targetPage;
        int i = Math.min(targetPage, targetBack);
        return i;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,p;

        System.out.println("Enter total pages: ");
        n = sc.nextInt();

        System.out.println("Enter desired page number: ");
        p = sc.nextInt();

        System.out.print("Min page count is: "+pageCount(n,p));
    }
}
