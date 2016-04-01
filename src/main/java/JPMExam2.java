import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by michaelbathon on 3/6/16.
 */
public class JPMExam2 {

        public String parseSumBinaryNumbers(String input){
            String answer = "";

            String[] inputArray = input.split(" ");

            int x = Integer.parseInt(inputArray[0], 2);
            int y = Integer.parseInt(inputArray[1], 2);
            int z = x + y;
            answer = Integer.toBinaryString(z);
            return answer;
        }


        public String binaryConverter(String input, String input2){

            int num1 = convertFromBinary(input);
            int num2 = convertFromBinary(input2);
            int decimalForm = num1 + num2;
            return convertBackToBinary(decimalForm);

        }

        public int convertFromBinary(String binaryStr){
            int decimalNum = 0;

            if(binaryStr.length() == 1 && binaryStr.charAt(0) == '1'){
                return 1;
            }
            if(binaryStr.length() == 1 && binaryStr.charAt(0) == '0'){
                return 0;
            }
            else{
                for(int i = 0; i < binaryStr.length()-1; i++){
                        decimalNum += Math.pow(2, binaryStr.length()-1 -i);
                }
            }
            return decimalNum;
        }

        public String convertBackToBinary(int decimalNum){
            String binaryNum = "";
            while(decimalNum > 0){
                if(decimalNum % 2 == 0){
                    binaryNum = "0" + binaryNum;
                }
                else{
                    binaryNum = "1" + binaryNum;
                }
                decimalNum = decimalNum/2;
            }
            return binaryNum;
        }



    public static boolean checkIfRectanglesOverlap(String recPointInput){

        ArrayList<Integer> rectangle1 = new ArrayList<Integer>();
        ArrayList<Integer> rectangle2 = new ArrayList<Integer>();
        ArrayList<String> points1 = new ArrayList<String>();
        ArrayList<String> points2 = new ArrayList<String>();


        String[] recPointsArray = recPointInput.split(" ");

        for(int i = 0; i < 8; i++){
            int recPoint = Integer.parseInt(recPointsArray[i]);

            if(i < 4)
                rectangle1.add(recPoint);
            else
                rectangle2.add(recPoint);

        }

        int x1 = rectangle1.get(0);
        int y1 = rectangle1.get(1);
        int width1 = rectangle1.get(2);
        int height1 = rectangle1.get(3);

        int x2 = rectangle2.get(0);
        int y2 = rectangle2.get(1);
        int width2 = rectangle2.get(2);
        int height2 = rectangle2.get(3);

        String rectangle1Pt1 = "" + x1 + "," + y1;
        String rectangle1Pt2 = "" + (x1+width1) + "," + y1;
        String rectangle1Pt3 = "" + (x1+width1) + "," + (y1+height1);
        String rectangle1Pt4 = "" + x1 + "," + (y1+height1);
        String rectangle2Pt1 = "" + x2 + "," + y2;
        String rectangle2Pt2 = "" + (x2+width2) + "," + y2;
        String rectangle2Pt3 = "" + (x2+width2) + "," + (y2+height2);
        String rectangle2Pt4 = "" + x2 + "," + (y2+height2);

        points1.add(rectangle1Pt1);
        points1.add(rectangle1Pt2);
        points1.add(rectangle1Pt3);
        points1.add(rectangle1Pt4);
        points2.add(rectangle2Pt1);
        points2.add(rectangle2Pt2);
        points2.add(rectangle2Pt3);
        points2.add(rectangle2Pt4);

        for(int j = 0; j < 4; j++){
            for(int k = 0; k < 4; k++){
                if(points1.get(j).equals(points2.get(k))){
                    return true;
                }
            }
        }
        return false;
    }




}
