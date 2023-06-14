package introduction;

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char lChar = Character.toLowerCase(s.charAt(l));
            char rChar = Character.toLowerCase(s.charAt(r));
            if (!Character.isLetterOrDigit(lChar)){
                l++;
            } else if (!Character.isLetterOrDigit(rChar)){
                r--;
            } else if (lChar!= rChar){
                return false;
            }else {
                l++;
                r--;
            }
        }
        return true;
    }
}
