package com.allianz.listeler;

import java.util.ArrayList;
import java.util.HashMap;

import com.allianz.vehicle.Araba;
import com.allianz.vehicle.Gemi;

public class ListelerMain {

	public static void main(String[] args) {
		
		//dizi();
		//diziAraba();
		//listeGemi();
		mapAraba();

	}
	
	
	public static void dizi() {
		
		String[] stringDizisi = new String[3];
		
		String diziElemani1 = "diziElemani1";
		String diziElemani2 = "diziElemani2";
		String diziElemani3 = "diziElemani3";
		
		System.out.println(stringDizisi[0]);
		
		stringDizisi[0] = diziElemani1;
		
		System.out.println(stringDizisi[0]);
		
	}
	
	public static void diziAraba() {
		
		Araba[] arabaDizisi = new Araba[2];
		
		Araba a1 = new Araba();
		a1.setRenk("mavi");
		
		Araba a2 = new Araba();
		a2.setRenk("sari");
		
		arabaDizisi[0] = a1;
		arabaDizisi[1] = a2;
		
		for (int i=0; i<2; i++) {
			
			System.out.println(arabaDizisi[i].getRenk());
		}
		
		
	}

	public static void listeGemi() {
		
		
		ArrayList<Gemi> gemiListesi = new ArrayList<Gemi>();
		
		Gemi g1 = new Gemi();
		g1.setPervaneSayisi(10);
		
		Gemi g2 = new Gemi();
		g2.setPervaneSayisi(15);
		
		
		gemiListesi.add(g1);
		gemiListesi.add(g2);
		
		for (Gemi g: gemiListesi) {
			System.out.println(g.getPervaneSayisi());
		}
		
	}

	public static void mapAraba() {
		
		HashMap<String, Araba> mapAraba = new HashMap<String, Araba>();
		
		Araba focus = new Araba();
		focus.setRenk("Emre");
		
		Araba suv = new Araba();
		suv.setRenk("Saadet");
		
		mapAraba.put("1", focus);
		mapAraba.put("7", suv);
		
		System.out.println(mapAraba.get("7").getRenk());
		
		
	}
}
