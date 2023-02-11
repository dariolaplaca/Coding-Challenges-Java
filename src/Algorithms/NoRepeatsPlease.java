package Algorithms;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoRepeatsPlease {

    //We create a recursive function to make all the available permutations for the given string and add them to a String Array passed as input
    public void recursivePermutation(String str, String ans, ArrayList<String> permutationArray, int originalStringLength){
        for(int i = 0; i < str.length(); i++){
            // Taking each char from the string
            char ch = str.charAt(i);
            // Taking the rest of the string except the taken char
            String left_subStr = str.substring(0, i);
            String right_subStr = str.substring(i + 1);
            String rest = left_subStr + right_subStr;
            // Reusing the function to add the ch at ans and let it add more chars from the rest string
            recursivePermutation(rest, ans + ch, permutationArray, originalStringLength);
        }
        // Checking if the current ans length is equal to the original string length
        if(ans.length() == originalStringLength){
            // If it's true we add the ans to the permutations array list
            permutationArray.add(ans);
        }
    }
    public int permAlone(String str){
        // Creating the effective array list
        ArrayList<String> permutations = new ArrayList<>();
        // Creating a regular expression pattern and predicate to filter out all strings in the array list that contain consecutive identical characters.
        Pattern pattern = Pattern.compile(".*(.)(\\1).*", Pattern.CASE_INSENSITIVE);
        Predicate<String> predicate = pattern.asPredicate();
        // Calling the recursivePermutation function
        recursivePermutation(str, "", permutations, str.length());
        // Removing all permutations from the array list that match with the regular expression
        permutations.removeIf(predicate);
        // Returning the number of valid permutations
        return permutations.size();
    }

    public static void main(String[] args) {
        NoRepeatsPlease perm = new NoRepeatsPlease();
        System.out.println("String: aaabb\n" +
                            "Expected output: 12\n" +
                            "Final Output: " + perm.permAlone("aaabb") +
                            "\n\nString: abfdefa\n" +
                            "Expected output: 2640\n" +
                            "Final Output: " + perm.permAlone("abfdefa")+
                            "\n\nString: abcdefa\n" +
                            "Expected output: 3600\n" +
                            "Final Output: " + perm.permAlone("abcdefa")+
                            "\n\nString: aab\n" +
                            "Expected output: 2\n" +
                            "Final Output: " + perm.permAlone("aab")

        );
    }

}




