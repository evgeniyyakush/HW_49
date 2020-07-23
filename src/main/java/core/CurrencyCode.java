
//When I work, in one class WebServices do one thing ONLY. In one class it does only one action then after it did it goes into another class where it does something else. 
//For these we can do Interface
//While doing UnitTest we can test just 2 methods that we have in here as UnitTest is a test of Methods that we have

package core;

import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CurrencyCode {
	
	static String getGeoValue(String ip, String name) throws Exception{
		
		JSONParser jp = new JSONParser();
		URL json = new URL(Input.geo_url + "?ip=" + ip);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(json.openConnection().getInputStream()));
		JSONObject jo = (JSONObject) jp.parse(in);
		return (String) jo.get(name);}
	
//	//we made this main method just to see whether our code is working or not
	
	public static void main(String[] args) throws Exception {
		//using "Input.a" it just takes it from the Input class

		System.out.println("Currency Exercise:");
		System.out.println("=================");
		
		System.out.println("Country: \t\t\t\t"            + getGeoValue(Input.a, "geoplugin_countryName")); 
		System.out.println("Currency Code: \t\t" 	  + getGeoValue(Input.a, "geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t\t"  + getGeoValue(Input.a, "geoplugin_currencySymbol_UTF8"));
		System.out.println("=================");
		
		System.out.println("Country: \t\t\t\t" 			  + getGeoValue(Input.b, "geoplugin_countryName"));
		System.out.println("Currency Code: \t\t"      + getGeoValue(Input.b, "geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t\t"  + getGeoValue(Input.b, "geoplugin_currencySymbol_UTF8"));
		System.out.println("=================");
		
		System.out.println("Country: \t\t\t\t" 			  + getGeoValue(Input.c, "geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" 	  + getGeoValue(Input.c, "geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t\t"  + getGeoValue(Input.c, "geoplugin_currencySymbol_UTF8"));
		System.out.println("=================");
		
		System.out.println("Country: \t\t\t\t" 			  + getGeoValue(Input.d, "geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" 	  + getGeoValue(Input.d, "geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t\t"  + getGeoValue(Input.d, "geoplugin_currencySymbol_UTF8"));
		System.out.println("=================");
		
		System.out.println("Country: \t\t\t\t" 			  + getGeoValue(Input.e, "geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" 	  + getGeoValue(Input.e, "geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t\t"  + getGeoValue(Input.e, "geoplugin_currencySymbol_UTF8"));
	}
}
