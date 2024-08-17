class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber>0){
            int r=(columnNumber-1)%26;
            s.append((char)(r+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return s.reverse().toString();
    }
}
