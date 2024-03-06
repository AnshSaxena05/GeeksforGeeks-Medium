import java.util.ArrayList;

public class gfg_Search_Pattern__Rabin_Karp_Algorithm {
    ArrayList<Integer> search(String pattern, String text) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = pattern.length();
        for (int i = 0; i <= text.length() - n; i++) {
            if (text.charAt(i) != pattern.charAt(0))
                continue;
            if (pattern.equals(text.substring(i, i + n)))
                res.add(i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        gfg_Search_Pattern__Rabin_Karp_Algorithm rabinKarp = new gfg_Search_Pattern__Rabin_Karp_Algorithm();

        String text = "ABABCABABABABCABAB";
        String pattern = "ABAB";

        ArrayList<Integer> result = rabinKarp.search(pattern, text);

        if (result.isEmpty()) {
            System.out.println("Pattern not found in the text.");
        } else {
            System.out.println("Pattern found at positions: " + result);
        }
    }
}
