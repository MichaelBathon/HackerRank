import java.util.Scanner;

/**
 * Created by michaelbathon on 2/24/16.
 */
public class OneDSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] numsArray = new int[arraySize];
        int negativeSubArrayCount = 0;

        for(int i = 0; i < numsArray.length; i++){
            numsArray[i] = scan.nextInt();
        }

        if(numsArray.length <= 1 && numsArray[0] < 0){
            System.out.println(1);
        }
        else if((numsArray.length <= 1 && numsArray[0] >= 0) || numsArray.length == 0){
            System.out.println(0);
        }
        else{
            for(int j = 0; j < numsArray.length; j++){
                int subArraySequenceHolder = 0;
                for(int k = j; k < numsArray.length; k++){
                    subArraySequenceHolder += numsArray[k];
                    if(subArraySequenceHolder < 0){
                        negativeSubArrayCount++;
                    }
                }
            }
        }
        System.out.println(negativeSubArrayCount);
    }
}
