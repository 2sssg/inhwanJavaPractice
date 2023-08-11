package task;

public enum Hopital {
	SNU("SEOUL_NATIONAL_UNIVERSITY");


	private String hospital;

	Hopital(String hospital) {
		this.hospital = hospital;
	}

	public String getHospital() {
		return hospital;
	}
}
