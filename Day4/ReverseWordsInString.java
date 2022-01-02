package Day4;
//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
public class ReverseWordsInString {

    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int start=0;
        int end=0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                end=i-1;
                reverseString(charArray,start,end);
                start=i+1;
            }
            if(i==charArray.length-1){
                reverseString(charArray,start,charArray.length-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb= sb.append(charArray);
        return sb.toString();
    }

    public void reverseString(char[] s,int start, int end) {
       while(start<end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        end--;
        start++;
       }
    }
   public static void main(String[] args) {
       String s= "Let's take LeetCode contest";
       ReverseWordsInString r = new ReverseWordsInString();
       r.reverseWords(s);
   }
}
