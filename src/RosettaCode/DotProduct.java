package RosettaCode;

import java.util.ArrayList;
import java.util.Arrays;

public class DotProduct {

    public int dotProduct(ArrayList<Integer> vect1, ArrayList<Integer> vect2){
        // Creating a variable to store the final number
        int finalNum = 0;
        for(int i = 0; i < vect1.size(); i++){
            // Iterating through the vectors arrays and sum the products of each respective component to the final number
            finalNum += vect1.get(i) * vect2.get(i);
        }
        // Returning the final number
        return finalNum;
    }
    public static void main(String[] args) {
        DotProduct dp = new DotProduct();

        System.out.println("Expected Output: 3\nOutput: " + dp.dotProduct(new ArrayList<Integer>(Arrays.asList(1, 3, -5)),
                                         new ArrayList<Integer>(Arrays.asList(4, -2, -1))));
        System.out.println("Expected Output: 130\nOutput: " + dp.dotProduct(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)),
                                         new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10))));
        System.out.println("Expected Output: 106\nOutput: " + dp.dotProduct(new ArrayList<Integer>(Arrays.asList(5, 4, 3, 2)),
                                         new ArrayList<Integer>(Arrays.asList(7, 8, 9, 6))));
        System.out.println("Expected Output: -36\nOutput: " + dp.dotProduct(new ArrayList<Integer>(Arrays.asList(-5, 4, -3, 2)),
                                         new ArrayList<Integer>(Arrays.asList(-7, -8, 9, -6))));
        System.out.println("Expected Output: 10392\nOutput: " + dp.dotProduct(new ArrayList<Integer>(Arrays.asList(17, 27, 34, 43, 15)),
                                         new ArrayList<Integer>(Arrays.asList(62, 73, 48, 95, 110))));

    }
}

/*
dotProduct([1, 3, -5], [4, -2, -1]) should return 3.
dotProduct([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) should return 130.
dotProduct([5, 4, 3, 2], [7, 8, 9, 6]) should return 106.
dotProduct([-5, 4, -3, 2], [-7, -8, 9, -6]) should return -36.
dotProduct([17, 27, 34, 43, 15], [62, 73, 48, 95, 110]) should return 10392.

 */
