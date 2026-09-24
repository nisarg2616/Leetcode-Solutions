class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int s=0;
            while(a>0){
                s+=a%10;
                a=a/10;
            }
            if(s==i) return i;
        }
        return -1;
    }
}