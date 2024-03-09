public class gfg_Find_the_N_th_character {
    public char nthCharacter(String s, int r, int n)
    {
        if(r==0) return s.charAt(n);
        
        for(int i=0;i<r;i++)
        {
            String temp="";
            for(int k=0;k<=n;k++)  // run loop only till n because 0<=n<|s|
            {
               if(s.charAt(k)=='0') temp=temp+"01";
               else temp=temp+"10";
            }
            s=temp;
        }
        
        return s.charAt(n);
    }
    public static void main(String[] args) {
        gfg_Find_the_N_th_character obj = new gfg_Find_the_N_th_character();

        // Example 1
        String inputString1 = "0";
        int rounds1 = 2;
        int position1 = 5;
        char result1 = obj.nthCharacter(inputString1, rounds1, position1);
        System.out.println("Example 1: The " + position1 + "-th character after " + rounds1 + " rounds is: " + result1);

        // Example 2
        String inputString2 = "110";
        int rounds2 = 1;
        int position2 = 2;
        char result2 = obj.nthCharacter(inputString2, rounds2, position2);
        System.out.println("Example 2: The " + position2 + "-th character after " + rounds2 + " round is: " + result2);
    }
}
