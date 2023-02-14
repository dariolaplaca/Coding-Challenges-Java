package misc;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // OUTPUT 6
        System.out.println(trap(new int[]{4,2,0,3,2,5})); // OUTPUT 9
    }
    static int trap(int[] height) {
        int maxHeight = Arrays.stream(height).max().getAsInt();

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
        int waterTrapped = Arrays.asList(fullMap).parallelStream().flatMapToInt(Arrays::stream).sum();
        return waterTrapped;
    }

}

