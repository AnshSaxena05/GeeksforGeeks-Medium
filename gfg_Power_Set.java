import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gfg_Power_Set {
    public void find(List<String> list, String s, String ans, int i) {
        if (i == s.length()) {
            list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        find(list, s, ans + ch, i + 1);
        find(list, s, ans, i + 1);
    }

    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> list = new ArrayList<>();
        find(list, s, "", 0);
        Collections.sort(list);
        list.remove("");
        return list;
    }

    public static void main(String[] args) {
        gfg_Power_Set powerSetFinder = new gfg_Power_Set();

        String input = "abc";
        List<String> result = powerSetFinder.AllPossibleStrings(input);

        System.out.println("All possible strings in lexicographically-sorted order:");
        for (String str : result) {
            System.out.print(str + " ");
        }
    }
}
