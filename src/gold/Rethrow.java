package gold;

/**
 * rethrowの例
 * @author TAKANAMI
 *
 */
public class Rethrow {
	public static void main(String[] args) {
		try {
			method();
		} catch (MyExceptionA e) {
			System.out.println(e.msgA);
		} catch (MyExceptionB e) {
			System.out.println(e.msgB);
		}
	}

	public static void method() throws MyExceptionA, MyExceptionB {
		int a = 10;
		try {
			if (a == 0) {
				throw new MyExceptionA();
			} else {
				throw new MyExceptionB();
			}
		} catch (Exception e) {
			// 例外が起きた際の、method() 側で行うべき処理
			// 処理が終わったら、例外をスローする
			throw e;
		}
	}
}

class MyExceptionA extends Exception {
	String msgA = "MyExceptionA";
}

class MyExceptionB extends Exception {
	String msgB = "MyExceptionB";
}