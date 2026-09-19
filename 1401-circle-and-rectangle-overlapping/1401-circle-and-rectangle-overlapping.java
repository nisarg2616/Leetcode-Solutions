class Solution {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        //double d =Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        //double s=d/Math.sqrt(2);
        // int l=Math.abs(x1-x2);
        // int b=Math.abs(y1-y2);
        int c=Math.max(x1,Math.min(x2,xc));
        int d=Math.max(y1,Math.min(y2,yc));
        double l=Math.sqrt(Math.pow((xc-c),2)+Math.pow((yc-d),2));
        if(l<=(double)r) return true;
        return false;
    }
}