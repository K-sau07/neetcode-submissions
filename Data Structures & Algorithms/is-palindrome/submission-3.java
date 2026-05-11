class Solution {
    public boolean isPalindrome(String s) {
        char[] ans= new char[s.length()];
        char [] cha= new char[s.length()];
        cha=s.toCharArray();
        int k =0;
        for(int i=0;i<ans.length;i++){
            if(cha[i]>=65&&cha[i]<=90){
                ans[k]=cha[i];
                k++;
            }
            else if(cha[i]>=97&&cha[i]<=122){
                ans[k]=cha[i];
                k++;
            }
            else if(cha[i]>='0'&&cha[i]<='9'){
                ans[k]=cha[i];
                k++;
            }      
        }


        for(int i =0,j=k-1;i<j;i++,j--){
            if(Character.toLowerCase(ans[i])!=Character.toLowerCase(ans[j])){
                return false;
            }
        }
        return true;
    }
}