package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class java58URL {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://127.0.0.1/query.php");
			HttpURLConnection Ucnn=(HttpURLConnection)url.openConnection();
			//連結
			Ucnn.connect();
			
			BufferedReader reader=new BufferedReader(
					new InputStreamReader(Ucnn.getInputStream()));
			String line;
			while((line=reader.readLine())!=null){
				String []data=line.split(":");
				System.out.println(data[0] + "-" + 
						data[1] + "-" +
						data[2]);
			}
			
				reader.close();			
//			InputStream in=Ucnn.getInputStream();
//			in.close();
		} catch (Exception e) {
		}
		
		

	}

}
