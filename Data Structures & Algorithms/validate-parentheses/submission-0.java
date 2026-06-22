class Solution {
    public boolean isValid(String s) {
        Deque<Character> pilha = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c =='[' || c=='{'){
                pilha.push(c);
            }else{
                if(pilha.isEmpty()){
                    return false;
                }
                else if(c == ')' && pilha.peek() == '(' ){
                    pilha.pop();
                }
                 else if(c == '}' && pilha.peek() == '{' ){
                    pilha.pop();
                }
                else if(c == ']' && pilha.peek() == '[' ){
                    pilha.pop();
                } 
                else{return false;}
            }
        }
        return pilha.isEmpty();
    }
}
