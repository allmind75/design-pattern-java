package strategy.case2.step3;

public class TestPattern {

	public static void main(String[] args) {

		// 데이터베이스를 전략적으로 선택하여 사용한다.
		DatabaseUse myDB = new DatabaseUse();
		myDB.connect();
		
		// A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(MySQL)가 한다.
		myDB.setDatabase(new MySQL());
		myDB.connect();
		myDB.select();
		
		// A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(Informix)가 한다.
		myDB.setDatabase(new Informix());
		myDB.connect();
		myDB.select();
		
		// [ 추가 요청 사항 ]
		// Oracle 클래스 추가와 다음 코드 추가만으로
		// 기존 코드의 수정 없이 오라클 접속 기능을 추가할 수 있다.
		myDB.setDatabase(new Oracle());
		myDB.connect();
		myDB.select();
	}
}
