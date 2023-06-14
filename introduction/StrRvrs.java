package introduction;

class Solution  {
    public String StrRvrs(String s){
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() -1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)){
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);

    }
    
}
