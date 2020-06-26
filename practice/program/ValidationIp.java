package practice.program;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ValidationIp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -704397970361423858L;

	public static long ipToLong(InetAddress ip) {
		byte[] octets = ip.getAddress();
		System.out.println(octets.length);
		System.out.println(octets[0]);
		long result = 0;
		for (byte octet : octets) {
			result <<= 8;
			result |= octet & 0xff;
		}
		return result;
	}
	
	
	public boolean isValidRange(String ipStart, String ipEnd, String ipToCheck) {
		try {
			long ipLo = ipToLong(InetAddress.getByName(ipStart));
			long ipHi = ipToLong(InetAddress.getByName(ipEnd));
			long ipToTest = ipToLong(InetAddress.getByName(ipToCheck));
			return (ipToTest >= ipLo && ipToTest <= ipHi);
		} catch (UnknownHostException e) {
			return false;
		}
	}
	
	public boolean validateIp(String FirstIp, String secondIp) throws UnknownHostException {
		long ipLo = ipToLong(InetAddress.getByName(FirstIp));
		long ipHi = ipToLong(InetAddress.getByName(secondIp));
		return (FirstIp==secondIp);
		
	}
	
	public static void main(String[] args) throws UnknownHostException {
		
		String ipone = "172.16.16.10";
		String iptwo= "172.16.16.11";
		ValidationIp ip = new ValidationIp();
		boolean value = ip.validateIp(ipone, iptwo);
		//System.out.println(value);
	}
}
