package misc;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println("Expected Output: 6\nOutput: " + trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // OUTPUT 6
        System.out.println("Expected Output: 9\nOutput: " + trap(new int[]{4,2,0,3,2,5})); // OUTPUT 9
    }
    static int trap(int[] height) {
        // Storing the max height (The highest value in the Array) as an int
        int maxHeight = Arrays.stream(height).max().getAsInt();
        // Creating a 2d Array Map from the elevation map and storing the cells with water with a 1 and the "wall" cells with a 0
        int[][] fullMap = new int[maxHeight][height.length];
        for(int i = 0; i < fullMap.length; i++){
            for (int j = 0; j < fullMap[i].length; j++ ){
                if(height[j] <= i){
                    fullMap[i][j] = 1;
                } else {
                    fullMap[i][j] = 0;
                }
            }
        }
        // System.out.println(Arrays.deepToString(fullMap));
        // Setting all the empty cells in each row that are not constrained between a wall as 0
        for(int i = 0; i < fullMap.length; i++){
            int j = 0;
            while(j < fullMap[i].length && fullMap[i][j] == 1){
                fullMap[i][j] = 0;
                j++;
            }
            int k = fullMap[i].length - 1;
            while(k >= 0 && fullMap[i][k] == 1){
                fullMap[i][k] = 0;
                k--;
            }
        }
        // System.out.println(Arrays.deepToString(fullMap));
        // Summing all the cells in the 2d Array, only the cells containing water are numbered by one
        int waterTrapped = Arrays.asList(fullMap).parallelStream().flatMapToInt(Arrays::stream).sum();
        return waterTrapped;
    }

}

