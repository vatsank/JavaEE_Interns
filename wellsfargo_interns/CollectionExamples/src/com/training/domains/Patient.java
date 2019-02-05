package com.training.domains;

public class Patient implements Comparable<Patient> {

	private int id;
	private String patientName;
	private boolean isInpatient;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String patientName, boolean isInpatient) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.isInpatient = isInpatient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public boolean isInpatient() {
		return isInpatient;
	}

	public void setInpatient(boolean isInpatient) {
		this.isInpatient = isInpatient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isInpatient ? 1231 : 1237);
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (id != other.id)
			return false;
		if (isInpatient != other.isInpatient)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", isInpatient=" + isInpatient + "]";
	}

	@Override
	public int compareTo(Patient o) {
		return this.patientName.compareTo(o.patientName);
	}
	

	
}
