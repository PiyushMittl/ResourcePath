package com.piyush.path.getresourceasstream;

import java.io.InputStream;

public class Main {
public static void  main(String a[]) {

		//get path of given file
		@SuppressWarnings("unused")
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		loader.getResource("doNotDelete.txt").getPath();
		
		//get Input stream of given file
		@SuppressWarnings("unused")
		InputStream is = Main.class.getResourceAsStream("/doNotDelete.txt");
		
}
}