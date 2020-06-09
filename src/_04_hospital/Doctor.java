package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private boolean makesHouseCalls = false;
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(getPatients().size() < 3) {
			patients.add(p);
		}else {
			throw new DoctorFullException();
		}
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
		for (int i = 0; i < getPatients().size(); i++) {
			patients.get(i).checkPulse();
		}
	}
}
