// GeeksforGeeks - First Repeated Character

class Gfrc {
    public static String firstRepChar(String s) {
        boolean[] arr = new boolean[26];
        for(char ch : s.toCharArray()){
            if(arr[ch - 'a']){
                return Character.toString(ch);
            }        
            arr[ch - 'a'] = true;
        }
        return "-1";
    }
}
