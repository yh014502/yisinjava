package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class java56URL {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://pdfmyurl.com?url=http://www.yahoo.com.tw");
			HttpURLConnection Ucnn=(HttpURLConnection)url.openConnection();
			//連結
			Ucnn.connect();
			InputStream in=Ucnn.getInputStream();
			FileOutputStream fout=new FileOutputStream("dir1/yahoo.pdf");
			byte []buf=new byte [4096];int len;
			while((len=in.read(buf))!=-1){
				fout.write(buf, 0, len);
			}
			
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
		} catch (Exception e) {
		}
		
		

	}

}
