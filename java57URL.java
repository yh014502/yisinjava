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

public class java57URL {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://127.0.0.1/add.php?cname=哈囉&tel=987520&birthday=1989-02-09");
			HttpURLConnection Ucnn=(HttpURLConnection)url.openConnection();
			//連結
			Ucnn.connect();
			Ucnn.getInputStream();
			
			System.out.println("OK");
		} catch (Exception e) {
		}
		
		

	}

}
