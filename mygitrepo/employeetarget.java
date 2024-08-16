class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i,n= hours.length,count=0;
        for(i=0;i<=n-1;i++)
        {
            if(hours[i]>=target)
           count++;
        }
        return count;
        
    }
}
