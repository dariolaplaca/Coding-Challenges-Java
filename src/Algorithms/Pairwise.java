package Algorithms;


import java.util.ArrayList;
import java.util.Arrays;

public class Pairwise {
    public int pairwise(ArrayList<Integer> arr, int targetSum) {
        // Create an ArrayList to hold the pairs
        ArrayList<Integer> pairsArr = new ArrayList<>();
        // Looping 2 times in the same array to find the pairs that fit the condition
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                // Checking if the sum is equal to the targetSum, evaluating if i and j are not targeting the same index
                // And if our pairs array doesn't contain already the index we are iterating
                if (arr.get(i) + arr.get(j) == targetSum && i != j && !pairsArr.contains(i) && !pairsArr.contains(j)) {
                    // In case add both index that match the condition
                    pairsArr.add(i);
                    pairsArr.add(j);
                }
            }
        }
        // If any pair is found return 0
        if (pairsArr.isEmpty()) {
            return 0;
        }
        // Return the sum of all the index through a Stream Interface
        return pairsArr.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Pairwise pw = new Pairwise();
        System.out.println("    TEST 1\n" +
                "Expected Output: 11\n" +
                "Output: " + pw.pairwise(new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3, 0, 5)), 7));


        System.out.println("\n    TEST 2\n" +
                "Expected Output: 1\n" +
                "Output: " + pw.pairwise(new ArrayList<Integer>(Arrays.asList(1, 3, 2, 4)), 4));


        System.out.println("\n    TEST 3\n" +
                "Expected Output: 1\n" +
                "Output: " + pw.pairwise(new ArrayList<Integer>(Arrays.asList(1, 1, 1)), 2));

        System.out.println("\n  TEST 4\n" +
                "Expected Output: 10\n" +
                "Output: " + pw.pairwise(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 1)), 1));

        System.out.println("\n    TEST 5\n" +
                "Expected Output: 0\n" +
                "Output: " + pw.pairwise(new ArrayList<Integer>(), 100));

    }
}
