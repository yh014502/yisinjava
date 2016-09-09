package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class java55URL {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.iii.org.tw");
			HttpURLConnection Ucnn=(HttpURLConnection)url.openConnection();
			//連結
			Ucnn.connect();
			
			BufferedReader reader=new BufferedReader(
					new InputStreamReader(Ucnn.getInputStream()));
			String line;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			
				reader.close();			
//			InputStream in=Ucnn.getInputStream();
//			in.close();
		} catch (Exception e) {
		}
		
		

	}

}
