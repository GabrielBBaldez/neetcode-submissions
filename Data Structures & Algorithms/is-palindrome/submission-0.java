class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            } 
        }
        String limpa = sb.toString();

       int esq = 0;
       int dir = limpa.length()-1;
       while(esq < dir){
          if(limpa.charAt(esq) != limpa.charAt(dir)){
            return false;
          }
           esq++;
           dir--;
       }
        return true;
    }
}
