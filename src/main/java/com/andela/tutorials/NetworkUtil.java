package com.andela.tutorials;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class NetworkUtil {

	public static String displayHostName(String ip) throws UnknownHostException {
		InetAddress inet = InetAddress.getByName(ip);
		return inet.getHostName();
	}

	public static Boolean pingHost(String hostName) {
		try {
			Socket socketConnection = new Socket(hostName, 80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static String downloadWebPage(String url) {
		try {
			URL weblink = new URL(url);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					weblink.openStream()));
			return reader.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("This code always runs");
		}
		return null;
	}

}
