class Solution {
    public String intToRoman(int num) {
        int[] a={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] b={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int c=0;
        String str=new String(); 
        while(num>0){
            if(num>=a[c]){
                str=str+b[c];
                num-=a[c];
            }else{
                c++;
            }
        }
        return str;
    }
}
