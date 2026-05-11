class Solution {
    public boolean isAnagram(String s, String t) {

        char [] ans= new char[s.length()*2];
        char[] ans1= new char[t.length()];

        HashMap<Character,Integer> result= new HashMap<>();



        ans=s.toCharArray();
        ans1=t.toCharArray();

        int count=1;

        if(s.length()!=t.length()){
            return false;
        }


        for(int i=0;i<ans.length;i++){
            if(result.containsKey(ans[i])){
                result.put(ans[i],result.get(ans[i]) + 1);
            }
            else{
                result.put(ans[i],count);
            }
        }

        for(int i =0;i<ans1.length;i++){
            if(result.containsKey(ans1[i])){
                result.put(ans1[i],result.get(ans1[i]) - 1);
            }
            else{
                return false;
            }
        }

        for(int value: result.values()){
            if(value<0){
               
                return false;
            }
        }

        return true;


    }
}
