package com.gamsnd.process;

public class Config {
	public static final int POPULATION = 100; // So ca the trong quan the
	public static final int GENERATION = 100; // So lan lap cua giai thuat di truyen
	public static final int NOCROSS = 100; // So ca the cha me mang ra lai ghep
	public static final int NOMUTANT = 1000; // So ca the dot bien
	public static final String DATAFILE = "data/a12_10_15.txt";

	public int getPOPULATION() {
		return POPULATION;
	}

	public int getGENERATION() {
		return GENERATION;
	}

	public String getDATAFILE() {
		return DATAFILE;
	}

}
