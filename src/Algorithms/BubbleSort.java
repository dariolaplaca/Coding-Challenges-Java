package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        ArrayList<Integer> myArr = new ArrayList<>(Arrays.asList(1,4,2,8,345,123,43,32,5643,63,123,43,2,55,1,234,92));
        System.out.println(myArr);
        bs.bubbleSort(myArr);
        System.out.println(myArr);

    }

    public void bubbleSort(ArrayList<Integer> arr){
        // Creating a boolean variable to see if we have sorted in the last iteration
        boolean isSwapping = true;
        // While loop to keep going sorting only if there was a swap in the iteration before
        while(isSwapping){
            // Setting isSwapping to false so if it doesn't match the if condition anymore it will close the while loop
            isSwapping = false;
            // Creating a loop to iterate through the array
            for(int i = 0; i < arr.size() - 1; i++){
                // Check if the current number is greater than the next number in the array
                if(arr.get(i) > arr.get(i + 1)){
                    // Creating a variable to store the current number
                    int x = arr.get(i);
                    // Swapping the current number with the next number
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, x);
                    // Setting isSwapping to true to keep going with the sorting
                    isSwapping = true;
                }
            }
        }
    }

}
