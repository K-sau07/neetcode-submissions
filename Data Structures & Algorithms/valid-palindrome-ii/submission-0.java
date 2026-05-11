class Solution {
    public boolean validPalindrome(String s) {

        int i =0;
        int j =s.length()-1;
        while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
            return isPalindrome(i+1,j,s)||isPalindrome(i,j-1,s);
           }
           i++;
           j--;
        }

        return true;


        
    }
    public boolean isPalindrome(int l , int r,String s){
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
}