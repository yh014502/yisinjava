package tw.org.iii.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class java53socket {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			//新建一個sendfile檔案存放picture.jpg
			File sendfile=new File("dir1/picture.jpg");
			//把圖片轉成長度放在buf
			byte[] buf = new byte[(int)sendfile.length()];
			//sendfile放在fis
			FileInputStream fis=new FileInputStream(sendfile);
			//fis再把長度讀出來
			fis.read(buf);
			fis.close();
			//傳送的目的地
			Socket socket=new Socket(InetAddress.getByName("10.1.6.83"), 999);
			//把socket往外拋
			OutputStream out=socket.getOutputStream();
			//將buf讀出去
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println(System.currentTimeMillis()-start);
			System.out.println("Send OK!");
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
