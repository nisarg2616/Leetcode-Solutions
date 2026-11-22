class Solution {
    public boolean checkString(String s) {
        int c=0;
        for(char ch:s.toCharArray()){
            c++;
            if(ch=='b') break;
        }
        String str=s.substring(c,s.length());
        return str.indexOf('a')==-1;
    }
}