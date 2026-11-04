class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int s=0;
        int c=0;
        for(int i:requests){
            c+=Math.abs(i-s);
            s=i;
        }
        return c;
    }
}