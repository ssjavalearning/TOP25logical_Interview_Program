package com.suraj.structrual.pattern.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Internet {
	
	public void connect(String hostname);
}

class RealInternet implements Internet {

	@Override
	public void connect(String hostname) {
		System.out.println("connecting to .."+hostname);
	}
}

class ProxyPattern implements Internet {

	private static List<String> list;
	Internet internet = new RealInternet();
	static {
		list = new ArrayList<>();
		list.add("abc.com");
		list.add("bbc.com");
		list.add("xyz.com");
		list.add("mnp.com");
		list.add("res.com");
	}
	@Override
	public void connect(String hostname) {
		
		if(list.contains(hostname)) {
			internet.connect(hostname);
		} else {
			System.out.println("access denied");
		}
	}
	
}
public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter hostname to connect:");
		String hostname = scanner.nextLine();
		Internet proxy = new ProxyPattern();
		proxy.connect(hostname);
	}
}
