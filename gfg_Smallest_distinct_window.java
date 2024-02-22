import java.util.HashSet;

public class gfg_Smallest_distinct_window {
    public int findSubString(String str) {
        // Your code goes here
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        int min = Integer.MAX_VALUE;
        int start = 0;
        int l = 0;
        int uni = 0;
        int c[] = new int[256];
        while (l < str.length()) {
            if (c[str.charAt(l)] == 0) {
                uni++;
            }

            c[str.charAt(l)]++;
            l++;
            while (uni == set.size()) {
                min = Math.min(min, l - start);
                c[str.charAt(start)]--;
                if (c[str.charAt(start)] == 0) {
                    uni--;
                }

                start++;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        gfg_Smallest_distinct_window obj = new gfg_Smallest_distinct_window();
        String inputString = "your_input_string_here";
        int result = obj.findSubString(inputString);
        System.out.println("Smallest distinct window length: " + result);
    }
}
