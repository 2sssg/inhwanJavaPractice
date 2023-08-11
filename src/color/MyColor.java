package color;

public class MyColor {

	public static final String COLOR_BLUE = "blue";
	public static final String COLOR_YELLOW = "yello";
	public static final String COLOR_RED = "red";


	/**
	 * color를 출력하는 함수입니다.
	 *
	 * @param color 이 파라미터는 위의 COLOR_*** 변수만 들어가야 합니다.
	 */
	public static void processColor(String color) {
		if (color.equals(COLOR_BLUE)) {
			System.out.println("파란색입니다.");
		} else if (color.equals(COLOR_YELLOW)) {
			System.out.println("노란색입니다.");
		} else {
			System.out.println("빨간색입니다.");
		}
	}


}
