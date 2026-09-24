class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);

            if (s.indexOf(s1) != t.indexOf(s2)) {
                return false;
            }
        }

        return true;
    }
}