class Solution {
    public boolean isValid(String s) {
        Deque<Character> pilha = new ArrayDeque<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i=0; i < s.length(); i++){
             char c = s.charAt(i);
             if(c == '(' || c == '[' || c =='{'){
                pilha.push(c);
             }
             else{
                if(pilha.isEmpty()){
                    return false;
                }
                else if(map.get(pilha.peek()) == c){
                    pilha.pop();
               }
               else {return false;}
             }
        }

        return pilha.isEmpty();
    }
}
