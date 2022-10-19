class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int i[] = new int[26];
        for(char c: s.toCharArray())
            i[c-'a']++;

        for(char c: t.toCharArray()){
            i[c-'a']--;
            if(i[c-'a'] == -1)
                return false;
        }
        return true;
    }
}