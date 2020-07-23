
//While doing UnitTest we can test just 2 methods that we have in here as UnitTest is a test of Methods that we have
package core;

import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CurrencyRate {
	
	
	
	
	
	//currencyRate website, from here we get a current currency
	//https://free.currencyconverterapi.com/
	//request where we get our currency
	//   --->  https://free.currconv.com/api/v7/convert?q=USD_EUR&compact=ultra&apiKey=89466ad6656efddea672
	
	//Method
	static String getRate(String pair_code) throws Exception {

		JSONObject json = new JSONObject();
		JSONParser jp = new JSONParser();
		
		URL rate_url = new URL(Input.currency_url + "/api/v7/convert?q=" + pair_code + "&compact=ultra&apiKey=" + Input.api_key ); json = (JSONObject) jp.parse(new BufferedReader(
		new InputStreamReader(rate_url.openConnection().getInputStream())));
		return json.get(pair_code).toString();}
	

	//we create Main just to check how the code is working
//	public static void main(String[] args) throws Exception {
//		System.out.println("USD_EUR: " + getRate("USD_EUR")); 
//		System.out.println("USD_CNY: " + getRate("USD_CNY")); 
//		System.out.println("USD_GBP: " + getRate("USD_GBP")); 
//		System.out.println("USD_UAH: " + getRate("USD_UAH")); 
//		System.out.println("USD_RUB: " + getRate("USD_RUB")); 
//		}
}
