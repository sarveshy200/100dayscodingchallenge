class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] s1 =new char[256];
        char [] t1=new char[256];

        for(int i=0;i<s.length();i++){
            char sChar =s.charAt(i);
            char tChar=t.charAt(i);
            if(s1[sChar]==0 && t1[tChar]==0){
                s1[sChar]=tChar;
                t1[tChar]=sChar;
            }else if(s1[sChar]!=tChar){
                return false;
            }
        }
        return true;
        
    }
}
