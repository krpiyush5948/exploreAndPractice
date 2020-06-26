package practice.program;

import java.net.InetAddress;

public class GetIpAddress {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.javatpoint.com");
			InetAddress ip1 = InetAddress.getByName("www.google.com");
			System.out.println("Host Name 1: " + ip.getHostName());
			System.out.println("Host Name 2: " + ip1.getHostName());
			System.out.println("ipAddress " + ip.getHostAddress());
			System.out.println("ipAddress " + ip1.getHostAddress());
			if (ip.equals(ip1)) {
				System.out.println("Both are equals");
			} else {
				System.out.println("Both the Inet Address are unequal");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
