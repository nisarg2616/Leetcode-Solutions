class Solution {
    public int countDominantElements(int[] nums) {
        int c=0;
        if(nums.length==1) return 1;
        int n=nums.length;
        for(int i=1;i<n-1;i++){
            if((nums[i]*2)>=(nums[i-1]+nums[i+1])) c++;
        }
        if(n>=2 && nums[0]>=nums[1]) c++;
        if(n>=2 && nums[n-1]>=nums[n-2]) c++;
        return c;
    }
}