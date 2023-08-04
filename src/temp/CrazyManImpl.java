package temp;

public class CrazyManImpl implements CrazyMan {
	
	private String name;
	
	public CrazyManImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}



	@Override
	public String sayingSomething(int commentNumber) {
		switch (commentNumber) {
			case 1:
				return "하하하하하하히앟ㄷ쟈ㅐ해ㅑ재ㅑㅏ햐ㅐ";
			default:
				return null;
		}
	}

	@Override
	public String whyCrazy() {
		return "교통사고";
	}

	@Override
	public String hospital(int listNumber) {
		switch (listNumber) {
			case 1:
				return "SNU";
			default:
				return null;
		}
	}

	@Override
	public String disease(int listNumber) {
		switch (listNumber) {
			case 1:
				return "후천적 지적장애";
			default:
				return null;
		}
	}

}
