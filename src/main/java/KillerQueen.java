import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/25/16.
 */
public class KillerQueen {


    public int queensThreatFinder(int[] array){
        ArrayList<Integer> queensPositions = new ArrayList<Integer>();
        int maxNumOfThreats = 0;
        int threatsHolder = 0;

        for(int i = 0; i < array.length; i++){
        queensPositions.add(array[i]);
        }

        for(int j = 0; j < queensPositions.size(); j++){
            for(int v = 0; v < queensPositions.size(); v++) {
                if(v != j){
                    if (queensPositions.get(j) == queensPositions.get(v) || (queensPositions.get(j) + (int)(Math.pow(v,2))) == queensPositions.get(v) ) { //Math.abs(queensPositions.get(j) - queensPositions.get(v)) == v
                    threatsHolder++;
                    }
                }
                if(threatsHolder > maxNumOfThreats){maxNumOfThreats = threatsHolder;}
            }
            threatsHolder = 0;
        }
    return maxNumOfThreats;
    }


}
