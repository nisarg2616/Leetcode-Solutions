class Solution {
    public int maxDepth(String s) {
        int r=0;
        int l=0;
        int d=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') l++;
            else if(ch==')') r++;
            d=Math.max(d,l-r);
        }
        return d;
    }
}