  class Solution {
    public int scoreOfString(String s) {
        int i;
        int n=s.length();
        int sum=0;
        for(i= 0; i<n-1;i++)
        {
            
            sum = sum + Math.abs(s.charAt(i)-s.charAt(i+1));
        
        }
            return sum; 
    

    }
}
