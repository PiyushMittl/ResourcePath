package com.piyush.path.getresources;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws URISyntaxException, IOException {
		URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
		File file = new File(location.getPath().toString().replace("/target/classes/", "/src/main/resources/test.txt"));
		//BufferedReader br = new BufferedReader(new FileReader(location.getPath().toString().replace("/target/classes/", "/src/test/java/tt.txt")));
		System.out.println("file created in /src/main/resources folder of project");
		file.createNewFile();
	}
}
