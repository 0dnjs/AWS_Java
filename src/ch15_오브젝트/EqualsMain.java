package ch15_오브젝트;

public class EqualsMain {

	public static void main(String[] args) {
		
		KoreaStudent koreaStdudent1 = new KoreaStudent("20230001", "변정민");
		KoreaStudent koreaStdudent2 = new KoreaStudent("20230002", "정가영");
		KoreaStudent koreaStdudent3 = new KoreaStudent("20230003", "정혜성");
		KoreaStudent koreaStdudent4 = new KoreaStudent("20230001", "변정민");
		
		// 메모리 주소
		System.out.println(koreaStdudent1 == koreaStdudent4);
		
		// 데이터(값) 비교
		System.out.println(koreaStdudent1.getStudentCode() == koreaStdudent4.getStudentCode()
				&& koreaStdudent1.getName() == koreaStdudent4.getName());
		
		System.out.println(koreaStdudent1.equals(koreaStdudent2));
	}

}
