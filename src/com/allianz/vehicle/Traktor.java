package com.allianz.vehicle;

public class Traktor extends Arac {
	
	boolean romorkVar;

//	public Traktor() {
//		this.romorkVar = true;
//	}
	
	public Traktor(boolean romorkVar) {
		this.romorkVar = romorkVar;
	}
	
	public boolean isRomorkVar() {
		return romorkVar;
	}

	public void setRomorkVar(boolean romorkVar) {
		this.romorkVar = romorkVar;
	}
	
	
	

}
