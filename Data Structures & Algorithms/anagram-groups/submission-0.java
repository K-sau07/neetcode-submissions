class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        String a=new String();
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
           char [] s=strs[i].toCharArray();
           Arrays.sort(s);
           a= new String(s);
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<>());
            }

            map.get(a).add(strs[i]);

        }

        return new ArrayList<>(map.values());

        


    }
}
