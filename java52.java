package tw.org.iii.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class java52 {

	public static void main(String[] args) {
		while(true){
		byte[]buf=new byte[1024];
		try {
			DatagramSocket ds=new DatagramSocket(888);
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			ds.close();
			
			InetAddress url=dp.getAddress();
			byte[]message=dp.getData();
			int len=dp.getLength();
			
			System.out.println(url.getHostAddress()+":"+
			new String(message,0,len));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("receive fail");
		}

	}

}
}