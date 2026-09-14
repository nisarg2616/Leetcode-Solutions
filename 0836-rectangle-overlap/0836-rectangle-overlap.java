class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        /*int a=(r1[0]+r1[2])/2;
        int b=(r1[1]+r1[3])/2;
        int c=(r2[0]+r2[2])/2;
        int d=(r2[1]+r2[3])/2;
        double d1=Math.sqrt((a-r1[0])*(a-r1[0])+(b-r1[1])*(b-r1[1]));
        double d2=Math.sqrt((c-r2[0])*(c-r2[0])+(d-r2[1])*(d-r2[1]));
        double di=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        return di<d1+d2; 31 testcases passed :)*/
        return(r1[2]>r2[0] && r1[0]<r2[2] && r1[3]>r2[1] && r1[1]<r2[3]);
    }
}