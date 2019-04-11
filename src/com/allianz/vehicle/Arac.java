package com.allianz.vehicle;

public class Arac {
	
	// renk
	// motorhacmi
	// ağırlık
	// beygir gücü
	
	private String renk;
	private float motorHacmi;
	private float agirlik;
	private int beygirGucu;
	
	//access modifier 
	
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		//renk skalamda yoksa değiştirme
		this.renk = renk;
	}
	public float getMotorHacmi() {
		return motorHacmi;
	}
	public void setMotorHacmi(float motorHacmi) {
		this.motorHacmi = motorHacmi;
	}
	public float getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(float agirlik) {
		this.agirlik = agirlik;
	}
	public int getBeygirGucu() {
		return beygirGucu;
	}
	public void setBeygirGucu(int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}
	
	

}
