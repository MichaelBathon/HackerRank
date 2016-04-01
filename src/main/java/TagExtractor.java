import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by michaelbathon on 2/28/16.
 */
public class TagExtractor {


    public static void printValidTagContent(Matcher m){
        if(m.find()){
            m.reset();
            while(m.find()){
                String content = m.group(2);
                System.out.println(content);
            }
        }
        else{
            System.out.println("None");
        }
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            //"<(.+)>\\b(.+)\\b</\\1>"
            //"<(.+)>\\b(.*)\\b(.+)\\b<\\/\\1>"

            Pattern pattern = Pattern.compile("<(.+)>\\b(.*\\1>)?(.*)\\b<\\/\\1>");
            Matcher m = pattern.matcher(line);
            TagExtractor.printValidTagContent(m);
            testCases--;
        }
    }

}
