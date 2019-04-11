package com.allianz.vehicle;

public class Araba extends Arac {
	
	String kasaTipi;

	public String getKasaTipi() {
		return kasaTipi;
	}

	public void setKasaTipi(String kasaTipi) {
		this.kasaTipi = kasaTipi;
	}
	
	public void setRenk(String r) {
		
		if ( r != "mavi" ) {
			//this.renk = renk;
			super.setRenk(r);
		} else {
			super.setRenk("sari");
		}
		
	}

}
