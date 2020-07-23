
//While doing UnitTest we can test just 2 methods that we have in here as UnitTest is a test of Methods that we have
//Getting local price   
package core;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LocalPrice {
	
	static Double getPrice(String price, String currency) throws NumberFormatException, Exception {
	return 
			new BigDecimal(Double.valueOf(price) * Double.valueOf(CurrencyRate.getRate(Input.us_symbol + "_" + currency))).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	
	
	public static void main(String[] args) throws Exception {
//		System.out.println(eur_price);

	}
}
