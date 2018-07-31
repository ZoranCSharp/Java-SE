import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReaderStream {
	
	public static void main(String args[]) {
		
		
		URL url = null;
		URLConnection urlConn = null;
		
		
		try {
			
			// Assume index.html is a default home page name
			url = new URL("http://www.google.com");
			urlConn = url.openConnection();
			
		}catch(IOException e) {
			
			System.out.println("Can't connect to the provided connection " + e.toString());
		}
		
		
		try(InputStreamReader in = new InputStreamReader(urlConn.getInputStream(), "UTF8");
			BufferedReader buff = new BufferedReader(in);){
			
			// Read and print the content of the Google's home page
		    // using Stream API
			
			buff.lines().forEach(System.out :: println);;
			
			
			
		}catch(IOException e) {
			
			System.out.println("Can't read from the Internet ");
		}
	}

}
