class Solution {
    public int minMoves(int[] nums) {
        int c=0;
        int min=nums[0];
        for(int i:nums){
            if(i<min) min=i;
            c+=i;
        }
        return (int)(c-(long)nums.length*min);
    }
}