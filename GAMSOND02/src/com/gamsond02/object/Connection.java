package com.gamsond02.object;

import java.util.ArrayList;
import java.util.Random;

public class Connection {
	private int requestID;
	private ArrayList<Gen> workingSetConnection;
	private ArrayList<ArrayList<Gen>> backupSetConnection;

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public ArrayList<Gen> getWorkingSetConnection() {
		return workingSetConnection;
	}

	public void setWorkingSetConnection(ArrayList<Gen> workingSetConnection) {
		this.workingSetConnection = workingSetConnection;
	}

	public ArrayList<ArrayList<Gen>> getBackupSetConnection() {
		return backupSetConnection;
	}

	public void setBackupSetConnection(
			ArrayList<ArrayList<Gen>> backupSetConnection) {
		this.backupSetConnection = backupSetConnection;
	}

	public Connection(int requestID, ArrayList<Gen> workingSetConnection,
			ArrayList<ArrayList<Gen>> backupSetConnection) {
		super();
		this.requestID = requestID;
		this.workingSetConnection = workingSetConnection;
		this.backupSetConnection = backupSetConnection;
	}

	public WorkingBackup genWorkingBackup() {

		// Chon ngau nhien 1 gen lam gen working
		Random random4 = new Random();
		// Chi so gen working
		int genWorkingIndex = random4.nextInt(this.workingSetConnection.size());
		// lay gen working
		Gen workingGen = this.workingSetConnection.get(genWorkingIndex);
		// Chi so gen backup
		int genBackupIndex = random4.nextInt(this.backupSetConnection.get(
				genWorkingIndex).size());
		// Lay gen backup
		Gen backupGen = this.backupSetConnection.get(genWorkingIndex).get(
				genBackupIndex);
		
		WorkingBackup newWorkingBackup = new WorkingBackup(workingGen,
				backupGen);
		return newWorkingBackup;
	}
}