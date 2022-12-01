public class GFG {
    // Method to find an equal index
    static int findIndex(String str)
    {
        int len = str.length();
        int cnt_close = 0;
        for (int i = 0; i < len; i++)
            if (str.charAt(i) == ')')
                cnt_close++;
        for (int i = 0; i < len; i++)
            if (cnt_close == i)
                return i;
        // If no opening brackets
        return len;
    }
    
    // Driver Method
    public static void main(String[] args)
    
//            "'(()', '2 - \"()\"'",
//                "')()())', '4 - \"()()\"'",
//                "')(()())', '6 - \"(()())\"'",
//                "')(', '0'",
    
    
    {
//        String str = "(()))(()()())))";
        String str = ")(";
        System.out.println(findIndex(str));
    }
}