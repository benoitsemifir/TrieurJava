package main;

import java.util.Arrays;

import trieur.Trieur;

public class Run {

	public static void main(String[] args) {

		int[] tabNombre = { 5, 4, 2, 8, 7, 1, 3, 6, 10, 9 };

		System.out.println("Avant Tri");
		System.out.println( Arrays.toString(tabNombre) );

//		Trieur.triSelection(tabNombre);
		
		
		Trieur.triBulle(tabNombre);
		
//		Arrays.sort(tabNombre);
		
		System.out.println("Aprés tri");
		System.out.println( Arrays.toString(tabNombre) );

	}
}
