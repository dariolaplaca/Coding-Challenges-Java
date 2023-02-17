package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
        // Instantiating indexes to iterate in the array and saving values positions
        // We use i to iterate in the array, sortingIndex to change the starting position and swapperIndex to save the index to swap with the sortingIndex value
        int sortingIndex = 0;
        int swapperIndex = 0;
        int i = 0;
        // Instantiating a variable to hold the Min Value in the iteration
        int sortingValue = Integer.MAX_VALUE;
        // Iterating through a while loop
        while(sortingIndex < arr.size()){
            // If we find a value that is the smallest we store it to let successive comparison, and we store the index as well
            if(arr.get(i) < sortingValue){
                sortingValue = arr.get(i);
                swapperIndex = i;
            }
            // When i get to the last item of the array we swap the value in sortingIndex with the value in the swapperIndex, we add 1 to the sortingIndex and reset all the other variables
            if(i == arr.size() - 1){
                Collections.swap(arr, sortingIndex, swapperIndex);
                sortingIndex++;
                i = sortingIndex - 1;
                sortingValue = Integer.MAX_VALUE;
            }
            i++;
        }
        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,2,8,345,123,43,32,5643,63,123,43,2,55,1,234,92));
        SelectionSort selecSort = new SelectionSort();
        System.out.println(selecSort.selectionSort(arr));
    }

}