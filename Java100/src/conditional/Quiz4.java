package conditional;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total_score = 200;
		if (total_score > 300) {
			System.out.println("good");
		} else {
			if (total_score > 180) {
				System.out.println( "매우 노력하세요. 재수강 대상자는 아닙니다." );
			} else {
				System.out.println( "매우 노력하세요. 재수강 대상자입니다." );
				
			}
		}
	}

}
