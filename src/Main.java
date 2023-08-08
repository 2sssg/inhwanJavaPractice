import guys.CrazyMan;
import guys.CrazyManImpl;

public class Main {

	public static void main(String... argv){
		CrazyMan Hong = new CrazyMan("홍길동");
		System.out.println(Hong.getName());
		System.out.println(Hong.getComment());
		System.out.println(Hong.getCause());
		System.out.println(Hong.getDisease());
		System.out.println(Hong.getHospital());
		System.out.println("작성자도 정상이 아니혀조ㅕㅑ허ㅗㅕㅑㅈ겨려ㅐ2ㅈ갷ㅈ갸ㅐ허ㅐ\n\n\n");

		CrazyMan AGH = new CrazyMan("ADH", "안녕하세요", "태생적",
				"SNU", "아스퍼거");

		System.out.println(AGH.getName());
		System.out.println(AGH.getComment());
		System.out.println(AGH.getCause());
		System.out.println(AGH.getDisease());
		System.out.println(AGH.getHospital("낵슨 푸르메재단 푸르메"));
		System.out.println(AGH.getHospital());

	}
}
