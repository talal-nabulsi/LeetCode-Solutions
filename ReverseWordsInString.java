public class Solution {
    public String reverseWords(String s) {
    
    s = s.trim(); 
    s.replaceAll("( )+", " ") ;
    String[] array = s.split(" ");
    int n = array.length;
        
    for (int i = 0; i < n/2; i++) {
        String first = array[i];
        String second = array[n-i-1];
        array[i] = second;
        array[n - i -1] = first;
    }
        
    StringBuilder finalString = new StringBuilder();
    for (String word : array) {
        finalString.append(word + " ");
    } 


    String reversed = finalString.toString();
    reversed = reversed.replaceAll("( )+", " ");

  
    
    return reversed.trim();
       
        
    }
}