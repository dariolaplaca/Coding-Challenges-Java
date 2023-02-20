package misc;

import java.util.ArrayList;
import java.util.Arrays;

public class NarcissisticNumber {

    public static void main(String[] args) {
        NarcissisticNumber NN = new NarcissisticNumber();
        System.out.println(NN.narcisNum(153));
    }
    public boolean narcisNum(int value){
        String valueToString = String.valueOf(value);
        int stringLength = valueToString.length();
        int sum = 0;
        for(int i = 0; i < stringLength; i++){
            sum += Math.pow(valueToString.charAt(i) - '0', stringLength);
        }
        return sum == value;
    }
}
