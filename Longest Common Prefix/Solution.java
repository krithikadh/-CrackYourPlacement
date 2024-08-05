class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int a=0;
        while(a<s1.length() && a<s2.length()){
            if(s1.charAt(a)==s2.charAt(a)){
                a++;
            }else{
                break;
            }
        }
        return s1.substring(0,a);
    }
}
