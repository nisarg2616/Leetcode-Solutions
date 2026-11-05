class Solution {
    public int findTheDistanceValue(int[] a, int[] b, int d) {
        int c=0;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<b.length;j++){
                if(Math.abs(a[i]-b[j])>d) flag++;
            }
            if(flag==b.length) c++;
        }
        return c;
    }
}