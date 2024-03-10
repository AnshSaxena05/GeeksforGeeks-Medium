import java.util.ArrayList;

public class Remove_all_duplicates {
    String removeDuplicates(String str) {
        ArrayList<Character> arr = new ArrayList<>();
        String res = "";
        for (char ch : str.toCharArray()) {
            if (!arr.contains(ch)) {
                res += ch;
                arr.add(ch);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Remove_all_duplicates remover = new Remove_all_duplicates();

        // Test the removeDuplicates method
        String inputString = "helloo";
        String result = remover.removeDuplicates(inputString);

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + result);
    }
}
