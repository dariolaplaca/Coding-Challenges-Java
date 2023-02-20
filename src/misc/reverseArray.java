package misc;


import java.util.Arrays;

/*
Given a random non-negative number, you have to return
     * the digits of this number within an array in reverse order.
 */
public class reverseArray {
    public static void main(String[] args) {
        reverseArray rA = new reverseArray();
        System.out.println(Arrays.toString(rA.revArr(299945)));
    }

    public int[] revArr(long number){
        String stringNum = String.valueOf(number);
        int[] finalArr = new int[stringNum.length()];
        for(int i = stringNum.length() - 1; i >= 0; i--){
            finalArr[stringNum.length() - i - 1] = stringNum.charAt(i) - '0';
        }
        return finalArr;
    }
}
