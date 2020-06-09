package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctors; 
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients; 
	}
	
	public void assignPatientsToDoctors() {
		int lastDoctorIndex = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(lastDoctorIndex).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				lastDoctorIndex++;
				i--;
			}
//			System.out.println("LDI: " + lastDoctorIndex);
//			System.out.println("i: " + i);
		}
	}
	
}
