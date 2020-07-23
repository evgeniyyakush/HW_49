
//While doing UnitTest we can test just 2 methods that we have in here as UnitTest is a test of Methods that we have
//From this class we get what we need

package core;

public class A {
	
	public static void main(String[] args) throws Exception {

		//here we have variables that know the country of each ip-address
		String a_country = CurrencyCode.getGeoValue(Input.a, "geoplugin_countryName");
		String b_country = CurrencyCode.getGeoValue(Input.b, "geoplugin_countryName");
		String c_country = CurrencyCode.getGeoValue(Input.c, "geoplugin_countryName");
		String d_country = CurrencyCode.getGeoValue(Input.d, "geoplugin_countryName");
		String e_country = CurrencyCode.getGeoValue(Input.e, "geoplugin_countryName");
		
		String a_currency = CurrencyCode.getGeoValue(Input.a, "geoplugin_currencyCode");
		String b_currency = CurrencyCode.getGeoValue(Input.b, "geoplugin_currencyCode");
		String c_currency = CurrencyCode.getGeoValue(Input.c, "geoplugin_currencyCode");
		String d_currency = CurrencyCode.getGeoValue(Input.d, "geoplugin_currencyCode");
		String e_currency = CurrencyCode.getGeoValue(Input.e, "geoplugin_currencyCode");
		
		String a_symbol = CurrencyCode.getGeoValue(Input.a, "geoplugin_currencySymbol_UTF8");
		String b_symbol = CurrencyCode.getGeoValue(Input.b, "geoplugin_currencySymbol_UTF8");
		String c_symbol = CurrencyCode.getGeoValue(Input.c, "geoplugin_currencySymbol_UTF8");
		String d_symbol = CurrencyCode.getGeoValue(Input.d, "geoplugin_currencySymbol_UTF8");       
		String e_symbol = CurrencyCode.getGeoValue(Input.e, "geoplugin_currencySymbol_UTF8");
		
		
		//in here we just play around seeing whether or not the script is working
		System.out.println(a_country + ": " + a_currency + "(" + a_symbol + ")");
		System.out.println(b_country + ": " + b_currency + "(" + b_symbol + ")");
		System.out.println(c_country + ": " + c_currency + "(" + c_symbol + ")");
		System.out.println(d_country + ": " + d_currency + "(" + d_symbol + ")");
		System.out.println(e_country + ": " + e_currency + "(" + e_symbol + ")");
		System.out.println();
		
		//simple version
		//System.out.println(CurrencyRate.getRate("USD_EUR"));	
		//pro version
		System.out.println(CurrencyRate.getRate(Input.us_symbol + "_" + a_currency));
		System.out.println(CurrencyRate.getRate(Input.us_symbol + "_" + b_currency));
		System.out.println(CurrencyRate.getRate(Input.us_symbol + "_" + c_currency));
		System.out.println(CurrencyRate.getRate(Input.us_symbol + "_" + d_currency));
		System.out.println(CurrencyRate.getRate(Input.us_symbol + "_" + e_currency));
		System.out.println();
		
	}
}
