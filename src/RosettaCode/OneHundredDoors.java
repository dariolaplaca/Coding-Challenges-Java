package RosettaCode;

import java.util.BitSet;

public class OneHundredDoors {

    public static void oneHundredDoorsFunc(int numDoors){
        // Initialize a BitSet of numDoors size, when initialized the BitSet automatically set all the stored values to false
        // A BitSet is a data structure that stores a set of bits (elements with values of either 0 or 1) as a sequence of bits, it could come in handy to keep track if a door is closed or opened
        BitSet finalDoorsArr = new BitSet(numDoors);
        // Iterate through the BitSet using two nested for loops, the i is used to give a start point and to let j iterates on each multiple index
        for(int i = 1; i <= numDoors; i++){
            for(int j = i - 1; j < numDoors; j += i){
                // With .flip we perform a NOT operation on the iterated value at index j
                finalDoorsArr.flip(j);
            }
        }
        // With .stream we convert the BitSet in a Stream data structure
        // Since the nested loops stored all the values starting from index 0 and the doors start from 1 we use .map to add 1 to every value
        // With forEachOrdered we perform a print for each element in our stream, to do this we use the method reference System.out::println
        finalDoorsArr.stream().map(door -> door + 1).forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        oneHundredDoorsFunc(100);
    }


}
