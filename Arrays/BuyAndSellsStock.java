package Arrays;

public class BuyAndSellsStock {
	
	public static int buyStocks(int sellingPrices[]) {
		
		int maxProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		
		for(int i=0;i<sellingPrices.length;i++){
			
			if(buyPrice < sellingPrices[i]){
				
				int profit = sellingPrices[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}else{
				buyPrice = sellingPrices[i];
			}
		}
		
	return maxProfit;
}
	

	public static void main(String[] args) {
		
		int sellingPrices[] = {7,6,4,3,1};  // [7, 1, 5, 3, 6, 4]
		System.out.println(buyStocks(sellingPrices));
	
	}

}
