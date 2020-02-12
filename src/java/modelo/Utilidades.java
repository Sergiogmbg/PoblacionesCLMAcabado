/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Usuario1
 */
public class Utilidades {
	public static ArrayList<String> getPoblaciones(String fichero) throws IOException{
		ArrayList<String> pueblos = new ArrayList<String>();
		
		try {
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), "utf-8"));
			String poblacion;			
			try {
				
				while((poblacion = buffer.readLine())!=null) {
					pueblos.add(poblacion);					
				 }
				
				buffer.close();
			} catch (IOException e) {
				
			}
		
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			
		}
		return pueblos;		
	}
}