class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];

        int i =0;

        for(;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                break;
            }
        }
        return a.substring(0,i);
    }
}