package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserire la BASE del rettangolo: ");
		int base = scanner.nextInt();
		
		System.out.print("Inserire l'ALTEZZA del rettangolo: ");
		int altezza = scanner.nextInt();
		
		Rettangolo areaRettangolo = new Rettangolo(base, altezza);
		int area = areaRettangolo.calcolaArea();
		System.out.println("L'AREA del rettangolo è: " + area + "cm");
		
		Rettangolo perimetroRettangolo = new Rettangolo(base, altezza);
		int perimetro = perimetroRettangolo.calcolaPerimetro();
		System.out.println("Il PERIMETRO del rettangolo è: " + perimetro + "cm");
		
		scanner.close();
	}

}
