package ex2;

public class MarketStage2 {

	public float computePriceWithoutDiscount(Constants.CLIENT_TYPES productType, float initialPrice, int timeSpent)
	  {
	    float finalPrice = 0;
	    float discountByTimeSpent = (timeSpent > Constants.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)timeSpent/100; 
	    if (productType == Constants.CLIENT_TYPES.NEW_CLIENT)
	    {
	    	finalPrice = initialPrice;
	    }
	    else if (productType == Constants.CLIENT_TYPES.REGULAR_CLIENT)
	    {
	    	finalPrice = (initialPrice - (Constants.LOW_DISCOUNT * initialPrice)) - discountByTimeSpent * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.FREQUENT_CLIENT)
	    {
	    	finalPrice = (initialPrice - (Constants.MEDIUM_DISCOUNT * initialPrice)) - discountByTimeSpent * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.EMAG_GENIUS)
	    {
	    	finalPrice = (initialPrice - (Constants.HIGH_DISCOUNT * initialPrice)) - discountByTimeSpent * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	    
	  }
	
}
