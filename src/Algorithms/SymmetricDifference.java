package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SymmetricDifference {
    public static void main(String[] args) {

        //FIRST TEST

        ArrayList<Integer> firstTest = SymDiff(new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 1, 5, 7)),
                new ArrayList<>(Arrays.asList(3, 4, 6, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(5, 3, 9, 8)),
                new ArrayList<>(Arrays.asList(1)));
        //should return [1, 2, 4, 5, 6, 7, 8, 9]

        //SECOND TEST

        ArrayList<Integer> secondTest = SymDiff(new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 1, 5, 7)),
                new ArrayList<>(Arrays.asList(3, 4, 6, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3))
        );

        //[2, 3, 4, 6, 7].

        //THIRD TEST

        ArrayList<Integer> thirdTest =SymDiff(new ArrayList<>(Arrays.asList(1, 1, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 2, 3, 5)),
                new ArrayList<>(Arrays.asList(3, 4, 5, 5)));
        //sym([1, 1, 2, 5], [2, 2, 3, 5], [3, 4, 5, 5]) should return [1, 4, 5].

        System.out.println("Expected output: [1, 2, 4, 5, 6, 7, 8, 9] " + "\nOutput: " + firstTest);
        System.out.println("\nExpected output: [2, 3, 4, 6, 7] " + "\nOutput: " + secondTest);
        System.out.println("\nExpected output: [1, 4, 5] " + "\nOutput: " + thirdTest);


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
        return finalSet;
    }
}
