class Solution {
    public String replaceDigits(String s) {
          String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int c = (int)s.charAt(i) - 48;
                result += (char)(s.charAt(i - 1) + c);
            } else {
                result += s.charAt(i);
            }
        }
        
        return result;
    }
}