public class gfg_Check_if_frequencies_can_be_equal {
    boolean sameFreq(String s) {
        // code here
        int freq[] = new int[26];
        for(char c: s.toCharArray()) freq[c - 'a']++;
        int count[] = new int[s.length() + 1];
        for(int i = 0 ; i < 26; i++) count[freq[i]]++;
        int cnt = 0, operations = 0, firstNonZero = 0;
        boolean firstNonZeroFound = false;
        if(count[1] > 1){firstNonZero = 1;firstNonZeroFound = true;}
        for(int i = 2; i < count.length; i++){
            if(count[i] > 0 && !firstNonZeroFound){
                firstNonZero = i;
                firstNonZeroFound = true;
            }
            if(count[i] > 0) cnt++;
            if(firstNonZeroFound) operations += count[i] * (i - firstNonZero);
        }
        if(count[1] == 1) {cnt--; operations++;};
        if(cnt > 2) return false;
        return operations <= 1;
    }
    public static void main(String[] args) {
        gfg_Check_if_frequencies_can_be_equal checker = new gfg_Check_if_frequencies_can_be_equal();

        // Test cases
        String str1 = "abcabc";
        String str2 = "aabbcc";
        String str3 = "aabbccc";

        System.out.println("Is frequency equal for '" + str1 + "': " + checker.sameFreq(str1));
        System.out.println("Is frequency equal for '" + str2 + "': " + checker.sameFreq(str2));
        System.out.println("Is frequency equal for '" + str3 + "': " + checker.sameFreq(str3));
    }
}
