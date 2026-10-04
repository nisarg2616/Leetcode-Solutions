class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[n/2];
        int c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(a-nums[i]);
        }
        return c;
    }
}