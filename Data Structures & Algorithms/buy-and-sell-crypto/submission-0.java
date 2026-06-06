class Solution {
    public int maxProfit(int[] prices) {

        int menorPreco = prices[0];
        int maiorLucro = 0;

        for(int i = 0; i < prices.length; i++){
              int lucroHoje = prices[i] - menorPreco;
              if(lucroHoje > maiorLucro){
                maiorLucro = lucroHoje;
              }
              if( prices[i] < menorPreco){
                menorPreco = prices[i];
              }
        }
        return maiorLucro; 
    }
}
