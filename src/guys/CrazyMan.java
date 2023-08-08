package guys;

public class CrazyMan implements Man {

	private final String[] sayingArr = {"dummy", "하하하하하하히앟ㄷ쟈ㅐ해ㅑ재ㅑㅏ햐ㅐ", ""};
	private final String[] hospitalArr = {"dummy", "SNU"};
	private final String[] diseaseArr = {"dummy", "후천적 지적장애"};

	private String name;
	private String comment;
	private String cause;
	private String hospital;
	private String disease;

	public String getName() {
		return name;
	}

	public CrazyMan(String name, String comment, String cause, String hospital, String disease) {
		this.name = name;
		this.comment = comment;
		this.cause = cause;
		this.hospital = hospital;
		this.disease = disease;
	}

	public CrazyMan(String name) {
		this.name = name;
		this.comment = sayingArr[1];
		this.cause = "교통사고";
		this.hospital = hospitalArr[1];
		this.disease = diseaseArr[1];
	}

	@Override
	public String getComment(int commentNumber) {
		return sayingArr[commentNumber];
	}
	public String getComment() {
		return comment;
	}


	public String getCause() {
		return cause;
	}

	public String getHospital(int listNumber) {
		return hospitalArr[listNumber];
	}

	public String getHospital(String hopt) {
		return hospital + " & " + hopt;
	}

	public String getHospital() {
		return hospital;
	}

	public String getDisease(int listNumber) {
		return diseaseArr[listNumber];
	}

	public String getDisease() {
		return disease;
	}



}
