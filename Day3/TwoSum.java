package Day3;
// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result= new int[2];
        int start =0,end=numbers.length-1;

        while(start<=end){
            int sum = numbers[start]+numbers[end];
            if(sum<target){
                start++;
            }else if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }else{
                end--;
            }
        }
        return result;
    }

    public static String reverseWord(String str)
    {
        // Reverse the string str
        int i=0,j=str.length()-1;
        char[] charArray= str.toCharArray();
        while(i<j){
            char temp = charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            j--;
            i++;
        }

        return charArray.toString();
    }
}
