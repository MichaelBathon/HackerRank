import java.util.Scanner;
import java.util.Stack;

/**
 * Created by michaelbathon on 3/17/16.
 */
public class JavaStack {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<Character> stack = new Stack<Character>();
            String input=sc.next();
            //Complete the code
            int i = 0;
            stack.push(input.charAt(i));
            for(i = 1; i < input.length(); i++){
                if(stack.empty()){
                    stack.push(input.charAt(i));
                }
                else if(Math.abs(stack.peek() - input.charAt(i)) == 1){
                    stack.pop();
                }
                else if(Math.abs(stack.peek() - input.charAt(i)) == 2){
                    stack.pop();
                }
                else{
                    stack.push(input.charAt(i));
                }
            }
            System.out.println(stack.empty());
        }

    }

}
