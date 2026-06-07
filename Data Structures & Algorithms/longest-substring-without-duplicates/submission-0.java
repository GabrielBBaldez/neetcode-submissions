class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> janela = new HashSet<>();
        int esq = 0;
        int maior = 0;

        for (int dir = 0; dir < s.length(); dir++) {
            char c = s.charAt(dir);
            while (janela.contains(c)) {     
                janela.remove(s.charAt(esq)); 
                esq++;                       
            }
            janela.add(c);
            maior = Math.max(maior, dir - esq + 1); 
        }
        return maior;
    }
}