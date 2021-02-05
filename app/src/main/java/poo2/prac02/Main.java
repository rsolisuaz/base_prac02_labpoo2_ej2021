package poo2.prac02;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		// Se declara una variable para mantener
		// una lista de Strings
		List<String> lineasEntrada = new ArrayList<>();
		
		// Se colocan Strings fijos en lineasEntrada
		// para probar el metodo procesaListaNumeros
		lineasEntrada.add("hola");
		lineasEntrada.add("46.2");
		lineasEntrada.add("17015");
		lineasEntrada.add("34.246");
		lineasEntrada.add("nuevo amigo mio");
		lineasEntrada.add("juan gana 2891.23 a la semana");
		lineasEntrada.add("2107.71");
		lineasEntrada.add("un millon");
		lineasEntrada.add("781.23");
		// Se define un codigo de idioma
		String codigoIdioma="es";
		// Se define un codigo de pais
		String codigoPais="MX";
		
		// Se llama al metodo procesaListaNumeros
		// creando un objeto de clase ProcesadorDatos
		ProcesadorDatos proc = new ProcesadorDatos();		
		List<String> lineasResultado = 
		  proc.procesaListaNumeros(lineasEntrada,
		  	codigoIdioma, codigoPais);

		// Se imprime el resultado devuelto por el metodo linea por linea
		for (String s:lineasResultado) {
			System.out.println(s);
		}
	}
}
