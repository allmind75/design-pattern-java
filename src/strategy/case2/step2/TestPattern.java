package strategy.case2.step2;

public class TestPattern {

	public static void main(String[] args) {

		DatabaseUse myDB = new DatabaseUse();

		// 데이터베이스를 세팅한다.
		myDB.connect(DBTYPE.MySQL);
		myDB.select();

		// 데이터베이스를 세팅한다.
		myDB.connect(DBTYPE.Informix);
		myDB.select();

		// [ 추가 요청 사항 ]
		// Oracle 클래스를 추가하고 세팅하여 사용하라
		myDB.connect(DBTYPE.Oracle);
		myDB.select();
		// Oracle 클래스 추가와 다음 코드 추가 후
		// DatabaseUse 에도 관련 코드를 추가해야 한다.

	}

}
