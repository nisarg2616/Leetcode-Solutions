class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int c=10;
        boolean f=true;
        while(n>=c){
            n=n-c;
            c--;
            f=!f;
        }
        return !f;
    }
}