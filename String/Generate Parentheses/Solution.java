class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        parenthesis(list,"",0,0,n);
        return list;
    }
    
    private void parenthesis(List<String> list, String curr, int openb, int closeb, int max) {
        if(curr.length()==max*2){
            list.add(curr);
            return;
        }
        if(openb<max){
            parenthesis(list,curr + "(",openb+1,closeb,max);
        }
        if(closeb<openb){
            parenthesis(list,curr + ")",openb,closeb+1,max);
        }
    }
}
