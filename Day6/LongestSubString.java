package Day6;
//Given a string s, find the length of the longest substring without repeating characters.
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        int len= 0;
        String result ="";
        for(int i=0;i<arr.length;i++){
            String  current = String.valueOf(arr[i]);
            if(result.contains(current)){
                result = result.substring(result.indexOf(current)+1);
            }
            result = result+String.valueOf(arr[i]);
            len = Math.max(result.length(), len);
        }
        return len;
    }

    public static void main(String[] args) {
        LongestSubString l = new LongestSubString();
        l.lengthOfLongestSubstring("abcabcbb");
    }
}
