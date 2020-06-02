package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private boolean makesHouseCalls = false;
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}
	
	public void doMedicine() {
		
	}
}
