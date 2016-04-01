import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by michaelbathon on 2/25/16.
 */
public class TwoDArray {

    public static void main(String[] args) {
        String testHourGlassNums = "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0";

        Scanner in = new Scanner(testHourGlassNums);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        TwoDArray twoDee = new TwoDArray();
        twoDee.calculateLargestHourGlass(arr);
    }

    ArrayList<Integer> hourGlassList = new ArrayList<Integer>();
    int hourGlassTopHolder = 0;
    int hourGlassMidHolder = 0;
    int hourGlassBottomHolder = 0;
    int hourGlassTotal = -100;
    int hourGlassTemp = 0;

    public int calculateLargestHourGlass(int[][] nestedArray) {


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                hourGlassList.add(nestedArray[i][j]);
            }
        }

        for (int k = 0; k <= 3; k++) {
            for (int b = 0; b <= 3; b++) {
                hourGlassTopHolder = hourGlassList.get(b + (k * 6)) + hourGlassList.get(b + 1 + (k * 6)) + hourGlassList.get(b + 2 + (k * 6));
                hourGlassMidHolder = hourGlassList.get(b + 7 + (k * 6));
                hourGlassBottomHolder = hourGlassList.get(b + 12 + (k * 6)) + hourGlassList.get(b + 13 + (k * 6)) + hourGlassList.get(b + 14 + (k * 6));
                hourGlassTemp = hourGlassTopHolder + hourGlassMidHolder + hourGlassBottomHolder;
                if (hourGlassTotal < hourGlassTemp) {
                    hourGlassTotal = hourGlassTemp;
                }
            }
        }
        return hourGlassTotal;
    }

}
