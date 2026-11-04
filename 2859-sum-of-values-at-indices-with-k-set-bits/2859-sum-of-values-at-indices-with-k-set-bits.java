class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0, j=0;
        for(int i:nums){
            if(Integer.bitCount(j)==k) s=s+i;
            j++;
        }
        return s;
    }
}