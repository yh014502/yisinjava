package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.InflaterInputStream;

public class java54serversocket {

	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(999);
			
			Socket socket=server.accept();
			FileOutputStream fout=new FileOutputStream("upload/yisin.jpg");
			InputStream in=socket.getInputStream();
			int c;
			while((c=in.read())!=-1){
				fout.write(c);
			}
			in.close();
			fout.flush();
			fout.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
