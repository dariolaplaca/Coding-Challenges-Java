package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SymmetricDifference {
    public static void main(String[] args) {

        //FIRST TEST

        List<Integer> firstSet = Arrays.asList(3, 3, 3, 2, 5);
        List<Integer> secondSet = Arrays.asList(2, 1, 5, 7);
        List<Integer> thirdSet = Arrays.asList(3, 4, 6, 6);
        List<Integer> fourthSet = Arrays.asList(1, 2, 3);
        List<Integer> fifthSet = Arrays.asList(5, 3, 9, 8);
        List<Integer> sixthSet = Arrays.asList(1);

        ArrayList<Integer> firstArrayList = new ArrayList<>(firstSet);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondSet);
        ArrayList<Integer> thirdArrayList = new ArrayList<>(thirdSet);
        ArrayList<Integer> fourthArrayList = new ArrayList<>(fourthSet);
        ArrayList<Integer> fifthArrayList = new ArrayList<>(fifthSet);
        ArrayList<Integer> sixthArrayList = new ArrayList<>(sixthSet);

        SymDiff(firstArrayList, secondArrayList, thirdArrayList, fourthArrayList, fifthArrayList, sixthArrayList);
        //should return [1, 2, 4, 5, 6, 7, 8, 9]

        //SECOND TEST
        /*
        List<Integer> firstSet = Arrays.asList(3, 3, 3, 2, 5);
        List<Integer> secondSet = Arrays.asList(2, 1, 5, 7);
        List<Integer> thirdSet = Arrays.asList(3, 4, 6, 6);
        List<Integer> fourthSet = Arrays.asList(1, 2, 3);

        ArrayList<Integer> firstArrayList = new ArrayList<>(firstSet);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondSet);
        ArrayList<Integer> thirdArrayList = new ArrayList<>(thirdSet);
        ArrayList<Integer> fourthArrayList = new ArrayList<>(fourthSet);

        SymDiff(firstArrayList, secondArrayList, thirdArrayList, fourthArrayList);
        //[2, 3, 4, 6, 7].
    */
        //THIRD TEST
        /*
        List<Integer> firstSet = Arrays.asList(1, 1, 2, 5);
        List<Integer> secondSet = Arrays.asList(2, 2, 3, 5);
        List<Integer> thirdSet = Arrays.asList(3, 4, 5, 5);


        ArrayList<Integer> firstArrayList = new ArrayList<>(firstSet);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondSet);
        ArrayList<Integer> thirdArrayList = new ArrayList<>(thirdSet);


        SymDiff(firstArrayList, secondArrayList, thirdArrayList);
        //sym([1, 1, 2, 5], [2, 2, 3, 5], [3, 4, 5, 5]) should return [1, 4, 5].
        */

    }

    public static ArrayList<Integer> SymDiff(ArrayList<Integer>... sets){

        ArrayList<Integer> finalSet = new ArrayList<>();
        ArrayList<Integer> alreadyInserted = new ArrayList<>();

        for(ArrayList<Integer> set : sets){
            for(int number : set){
                if(!finalSet.contains(number) && !alreadyInserted.contains(number)){
                    finalSet.add(number);
                }
                else{
                    finalSet.removeIf(eachNumber -> eachNumber == number && !alreadyInserted.contains(number));
                }
                alreadyInserted.add(number);
            }
            alreadyInserted.clear();
        }
        Collections.sort(finalSet);
        System.out.println(finalSet);
        return finalSet;
    }
}
