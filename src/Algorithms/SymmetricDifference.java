package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SymmetricDifference {

    public static ArrayList<Integer> SymDiff(ArrayList<Integer>... sets){
        // Initializing two Array list, one to store the final set and one to check if a value of the iterated set was already inserted to avoid duplicates
        ArrayList<Integer> finalSet = new ArrayList<>();
        ArrayList<Integer> alreadyInserted = new ArrayList<>();
        // Iterating through the set in the sets varargs with a for each
        for(ArrayList<Integer> set : sets){
            for(int number : set){
                // Check if the set does not contain the number already and if was not already inserted
                if(!finalSet.contains(number) && !alreadyInserted.contains(number)){
                    // If the condition is verified it adds the number in the final set
                    finalSet.add(number);
                }
                else{
                    // If the condition is not verified the values is removed only if is not already inserted
                    finalSet.removeIf(eachNumber -> eachNumber == number && !alreadyInserted.contains(number));
                }
                // Adds the number iterated to the already inserted array list
                alreadyInserted.add(number);
            }
            // Empties the already inserted array list at the end of the iteration of the previous set
            alreadyInserted.clear();
        }
        // Sorts all the numbers in the final set
        Collections.sort(finalSet);
        // Returns the array list final set
        return finalSet;
    }
    public static void main(String[] args) {

        //FIRST TEST

        ArrayList<Integer> firstTest = SymDiff(
                new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
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

        //should return [2, 3, 4, 6, 7].

        //THIRD TEST

        ArrayList<Integer> thirdTest =SymDiff(new ArrayList<>(Arrays.asList(1, 1, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 2, 3, 5)),
                new ArrayList<>(Arrays.asList(3, 4, 5, 5)));
        //should return [1, 4, 5].

        System.out.println("Expected output: [1, 2, 4, 5, 6, 7, 8, 9] " + "\nOutput: " + firstTest);
        System.out.println("\nExpected output: [2, 3, 4, 6, 7] " + "\nOutput: " + secondTest);
        System.out.println("\nExpected output: [1, 4, 5] " + "\nOutput: " + thirdTest);


    }
}
