package juego.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Carga el archivo del mundo
public class Utils {
	public  String loadFileAsString(String path) {
		
		StringBuilder builder = new StringBuilder();
			
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
			String line;
			while((line = br.readLine()) != null)
				builder.append(line + "\n");
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		return builder.toString();
	}
	
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch(NumberFormatException e ) {
			e.printStackTrace();
			return 0;
		}
	}
}
