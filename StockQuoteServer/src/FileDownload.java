import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownload {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			
			System.out.println("Proper usage: java FileDownload SourceFileURL OutputFileName");
			
			System.out.println("For example: java FileDownload hhtp://myflex.org/yf/nys/.jpg nyc.jpg");
			
			System.exit(-1);
		}
		
		URLConnection urlConn = null;
		
		try {
			
			URL remoteFile = new URL(args[0]);
			urlConn = remoteFile.openConnection();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		try( FileOutputStream fOut = new FileOutputStream(args[1]);
			  InputStream in = urlConn.getInputStream();){
			
			//Read a remote file and save it in the local one
			int data;
			System.err.println("Starting the download from: " + args[0]);
			while((data = in.read()) != -1) {
				
				fOut.write(data);
			}
			System.out.println("Finished downloading the file " + args[1]);
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
