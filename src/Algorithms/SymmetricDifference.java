package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SymmetricDifference {
    public static void main(String[] args) {

        //FIRST TEST

        SymDiff(new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 1, 5, 7)),
                new ArrayList<>(Arrays.asList(3, 4, 6, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(5, 3, 9, 8)),
                new ArrayList<>(Arrays.asList(1)));

        //should return [1, 2, 4, 5, 6, 7, 8, 9]

        //SECOND TEST
        /*
        SymDiff(new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 1, 5, 7)),
                new ArrayList<>(Arrays.asList(3, 4, 6, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3))
        );
        */

        //[2, 3, 4, 6, 7].

        //THIRD TEST
        /*
        SymDiff(new ArrayList<>(Arrays.asList(1, 1, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 2, 3, 5)),
                new ArrayList<>(Arrays.asList(3, 4, 5, 5)));
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
