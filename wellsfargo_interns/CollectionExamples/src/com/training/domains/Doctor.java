package com.training.domains;

public class Doctor implements Comparable<Doctor> {

	private long id;
	private String doctorName;
	private String specialization;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization + "]";
	}
	public Doctor(long id, String doctorName, String specialization) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (id != other.id)
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}
	@Override
	public int compareTo(Doctor o) {
		return this.doctorName.compareTo(o.doctorName);
	}
	
	
	
}
