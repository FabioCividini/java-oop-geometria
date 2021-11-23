package org.generation.italy.geometria;

public class Rettangolo {
	//attributi interi
	int base;
	int altezza;
	
	//costruttore con parametri
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	//metodo calcolaArea
	int calcolaArea() {
		int calcolaArea = base * altezza;
		return calcolaArea;
	}
	
	//metodo calcolaPerimetro
	int calcolaPerimetro() {
		int calcolaPerimetro = base * 2 + altezza * 2;
		return calcolaPerimetro;
	}
	
}
