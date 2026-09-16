// Leetcode - 387. First Unique Character in a String

class L387 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }   
}
