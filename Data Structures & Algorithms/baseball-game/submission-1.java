class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record= new Stack<>();
       
       for(String op:operations){
        if(op.equals("+")){
            int top=record.pop();
            int newtop=top+record.peek();
            record.push(top);
            record.push(newtop);
        }
        else if(op.equals("D")){
            int score=record.peek()*2;
            record.push(score);
        }
        else if(op.equals("C")){
            record.pop();
        }
        else{
            record.push(Integer.parseInt(op));
        }
       }
       int sum=0;
       for(int i:record){
        sum+=i;
       }
      return sum;

    }
}