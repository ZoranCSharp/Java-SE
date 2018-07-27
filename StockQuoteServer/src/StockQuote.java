import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.StringTokenizer;

public class StockQuote {

	public static void printStockQuotes(String symbol) {
		
		String csvString;
		URL url = null;
		URLConnection urlConn = null;
		
		try {
			url = new URL("https://quote.yahoo.com/d/quotes.csv?s=" + symbol + "&f=sl1d1t1c1ohgv&e=.csv");
			urlConn = url.openConnection();			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		try(InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
			BufferedReader buff = new BufferedReader(inStream);){
			
			//get the quote as a csv string
			csvString = buff.readLine();
			
			//parse the csv string
			
			StringTokenizer tokenizer = new StringTokenizer(csvString, ",");
			String ticker = tokenizer.nextToken();
			String price = tokenizer.nextToken();
			String tradeDate = tokenizer.nextToken();
			String tradeTime = tokenizer.nextToken();
			
			System.out.println("Symbol: " + ticker + " Price: " + price + " tradeDate " + tradeDate + " tradeTime " + tradeTime);
				
			
		}catch(MalformedInputException e) {
			
			System.out.println("Please check the spelling of " + "the URL: " + e.toString());
		}catch(IOException ioe) {
			
			System.out.println("Can't read from the Internet: " + ioe.toString());
		}

	}
	
	public static void main(String args[]) {
		
		if(args.length == 0) {
			
			System.out.println("Sample usage: java StockQuote IBM");
			System.exit(0);
		}
		
	
	printStockQuotes(args[0]);

}
	
}


















