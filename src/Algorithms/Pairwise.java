package Algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Given an array arr, find element pairs whose sum equal the second argument arg and return the sum of their indices.

You may use multiple pairs that have the same numeric elements but different indices.
Each pair should use the lowest possible available indices. Once an element has been used it cannot be reused to pair with another element.
For instance, pairwise([1, 1, 2], 3) creates a pair [2, 1] using the 1 at index 0 rather than the 1 at index 1, because 0+2 < 1+2.

For example pairwise([7, 9, 11, 13, 15], 20) returns 6. The pairs that sum to 20 are [7, 13] and [9, 11].
We can then write out the array with their indices and values.

function pairwise(arr, arg) {
  let pairsArr = []
  let finalNum = 0;
  for(let i = 0; i < arr.length ; i++){
    for(let j = 0; j < arr.length; j++){
      if((arr[i] + arr[j] == arg) && (i != j) && (!(pairsArr.includes(i)) && (!pairsArr.includes(j)))){
        pairsArr.push(i, j);
        console.log(pairsArr)
      }
    }
  }
  if(pairsArr.length === 0){
    return 0;
  }
  else{
    for(let i = 0; i < pairsArr.length; i++){
      finalNum += pairsArr[i];
    }
    return finalNum;
  }
}



 */
public class Pairwise {
    public int pairwise(ArrayList<Integer> arr, int targetSum){
        ArrayList<Integer> pairsArr = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == targetSum && i != j && !pairsArr.contains(i) && !pairsArr.contains(j)) {
                    pairsArr.add(i);
                    pairsArr.add(j);
                }
            }
        }
        if(pairsArr.isEmpty()) {
            return 0;
        }
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
    /*
      pairwise([1, 4, 2, 3, 0, 5], 7) should return 11.
      pairwise([], 4) should return 1.
      pairwise([1, 1, 1], 2) should return 1.
      pairwise([0, 0, 0, 0, 1, 1], 1) should return 10.
      pairwise([], 100) should return 0.

     */
}
