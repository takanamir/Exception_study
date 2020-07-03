package gold;

import java.sql.SQLException;

/**
 * try-with-resources文の使用例
 * @author TAKANAMI
 *
 */
public class TryWithResources {
	public static void main(String[] args) {
		try (MyResource1 obj1 = new MyResource1("obj1");
				MyResource1 obj2 = new MyResource1("obj2")) {
			System.out.println("try ブロック内の処理");
			throw new SQLException();
		} catch (SQLException e) {
			System.out.println("catch ブロック：SQLException");
		} catch (Exception e) {
			System.out.println("catch ブロック：Exception");
		} finally {
			System.out.println("finally ブロック");
		}
	}
}

class MyResource1 implements AutoCloseable {
	private String msg;

	public MyResource1(String msg) {
		this.msg = msg;
	}

	public void close() throws Exception {
		System.out.println("close() : " + msg);
	}
}