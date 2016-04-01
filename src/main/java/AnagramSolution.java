import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by michaelbathon on 2/20/16.
 */
public class AnagramSolution {


        static boolean isAnagram(String A, String B) {
            //Complete the function
            A = A.toLowerCase();
            B = B.toLowerCase();

            ArrayList<Character> list1 = new ArrayList<Character>();
            ArrayList<Character> list2 = new ArrayList<Character>();
            for(int i = 0; i < A.length(); i++){
                list1.add(A.charAt(i));
            }
            Collections.sort(list1);
            for(int j = 0; j < B.length(); j++){
                list2.add(B.charAt(j));
            }
            Collections.sort(list2);

            if(list1.equals(list2)){
                return true;
            }else return false;
        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            boolean ret=isAnagram(A,B);
            if(ret)System.out.println("Anagrams");
            else System.out.println("Not Anagrams");

        }
}
