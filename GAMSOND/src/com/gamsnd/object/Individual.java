package com.gamsnd.object;

public class Individual {
	private int ID;
	private double fitness;
	private Chromosome workingChromosome;
	private Chromosome backupChromosome;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	public Chromosome getWorkingChromosome() {
		return workingChromosome;
	}

	public void setWorkingChromosome(Chromosome workingChromosome) {
		this.workingChromosome = workingChromosome;
	}

	public Chromosome getBackupChromosome() {
		return backupChromosome;
	}

	public void setBackupChromosome(Chromosome backupChromosome) {
		this.backupChromosome = backupChromosome;
	}

	public Individual(int iD, double fitness, Chromosome workingChromosome,
			Chromosome backupChromosome) {
		super();
		ID = iD;
		this.fitness = fitness;
		this.workingChromosome = workingChromosome;
		this.backupChromosome = backupChromosome;
	}

}
