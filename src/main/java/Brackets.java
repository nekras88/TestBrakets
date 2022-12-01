public class Brackets {
    
    public static void main(String[] args) {
    
    }
    
    public String calculateBrackets(String string) {
        char[] chars = string.toCharArray();
        int firstBracket = string.indexOf('(');
        StringBuilder expected = new StringBuilder();
        expected.append('(');
        
        int lastElement = chars.length - 1;
        
        boolean isClosingBracket = chars[lastElement] == ')';
        
        if (firstBracket == lastElement) {
            return "0";
        }
        
        for (int i = firstBracket + 1; i < chars.length; i++) {
            if (chars[i] == ')' && !(expected.length() % 2 == 0 && i == lastElement)) {
                expected.append(")");
            } else if (chars[i] == '(' && (i + 1) == lastElement && isClosingBracket) {
                expected.append(")");
                i = lastElement;
            } else if (i != lastElement) {
                expected.append('(');
            }
        }
        
        return expected.length() + " - \"" + expected + "\"";
    }
}
