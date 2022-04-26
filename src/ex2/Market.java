package ex2;

public class Market {
	
	///OBS: first we had to figure out what it was we were looking at, and this is what we came up with
	public float computePriceWithoutDiscount(int productType, float initialPrice, int timeSpent)
	  {
	    float finalPrice = 0;
	    float discountByTimeSpent = (timeSpent > 10) ? (float)30/100 : (float)timeSpent/100; 
	    if (productType == 1)
	    {
	    	finalPrice = initialPrice;
	    }
	    else if (productType == 2)
	    {
	    	finalPrice = (initialPrice - (0.1f * initialPrice)) - discountByTimeSpent * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	    	finalPrice = (initialPrice - (0.25f * initialPrice)) - discountByTimeSpent * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	    	finalPrice = (initialPrice - (0.35f * initialPrice)) - discountByTimeSpent * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	    
	  }
}
