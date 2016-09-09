package tw.org.iii.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class java51 {

	public static void main(String[] args) {
		while(true){
		String data=" testtest";
		byte[]buf=data.getBytes();
		
		try {
			DatagramSocket ds=new DatagramSocket();
			DatagramPacket dp=new DatagramPacket(buf, 
					buf.length,InetAddress.getByName("10.1.6.91"),8888);
			ds.send(dp);
			ds.close();
			System.out.println("send OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("send fail");
		}
		

	}

}}
