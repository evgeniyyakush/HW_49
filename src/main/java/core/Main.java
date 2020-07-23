

//It's a great combination of SELENIUM and WebServices

//While doing UnitTest we can test just 2 methods that we have in here as UnitTest is a test of Methods that we have
//Here we with AMAZON
package core;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	static WebDriver driver;
	
//  Alexa
	//static String url = "https://www.amazon.com/dp/B07FZ8S74R";
//  MacBook
	//static String url = "https://www.amazon.com/dp/B081FZV45H";
//  Hermes_Parfume
	static String url = "https://www.amazon.com/dp/B00XPOFZDA";

	
	public static void main(String[] args) throws Exception {
		
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
		
//		Warnings OFF
		Logger.getLogger("").setLevel(Level.OFF);
		
//		Driver
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/firefox");
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);

		String product_title = driver.findElement(By.id("productTitle")).getText();
		String original_price = driver.findElement(By.id("priceblock_ourprice")).getText().replaceAll(",", "").replace("$", "");
		//double original_price = Double.parseDouble(driver.findElement(By.id("priceblock_ourprice")).getText().replace("$", ""));
		
		driver.quit();
	
//		Testing the validity of variables
		//System.out.println(product_title);
		//System.out.println(original_price);

		
		//Java String to double
		/*
		 "Double.parseDouble()" - into primitive 
		 "Double.valueOf" - into Object
		 */

		
//		Testing the price in EUR in this main method
		//double eur_price = new BigDecimal(Double.valueOf(Input.price) * Double.valueOf(CurrencyRate.getRate(Input.us_symbol + "_" + a_currency))).setScale(2, RoundingMode.HALF_UP).doubleValue();
		//System.out.println(eur_price);
		
//		In here we ask for a price from a different method
		//System.out.println(LocalPrice.getPrice(Input.price, a_currency));

		//Simple_version
		//System.out.println("Item: Echo Dot (3rd Gen) - Smart speaker with Alexa - Charcoal; US Price: $49.99; for country: France;	Local Price: € 43.13");
		//Pro_version (substituted with dynamic Elements)
		System.out.println("Item: " + product_title + "; "+ "US Price: $" + original_price + "; "+ "for country: " + a_country + "; "+ "Local Price: " + a_symbol + " "+ LocalPrice.getPrice(original_price, a_currency));
		System.out.println("Item: " + product_title + "; "+ "US Price: $" + original_price + "; "+ "for country: " + b_country + "; "+ "Local Price: " + b_symbol + " "+ LocalPrice.getPrice(original_price, b_currency));
		System.out.println("Item: " + product_title + "; "+ "US Price: $" + original_price + "; "+ "for country: " + c_country + "; "+ "Local Price: " + c_symbol + " "+ LocalPrice.getPrice(original_price, c_currency));
		System.out.println("Item: " + product_title + "; "+ "US Price: $" + original_price + "; "+ "for country: " + d_country + "; "+ "Local Price: " + d_symbol + " "+ LocalPrice.getPrice(original_price, d_currency));
		System.out.println("Item: " + product_title + "; "+ "US Price: $" + original_price + "; "+ "for country: " + e_country + "; "+ "Local Price: " + e_symbol + " "+ LocalPrice.getPrice(original_price, e_currency));
		
		
//		Testing the validity of variables
		//System.out.println(original_price);
		//System.out.println(a_currency);

	}
}

