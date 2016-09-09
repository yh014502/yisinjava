package tw.org.iii.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class java50inetaddress {

	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getByName("www.hinet.net	");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
		System.out.println("UnknownHost");
		}

	}

}
