package gold;

/**
 * マルチキャッチの例
 * @author TAKANAMI
 *
 */
public class MultiCatch {
	public static void main(String[] args) {
		String s = "A";
		int[] num = { 10, 0 };
		try {
			// System.out.print(Integer.parseInt(s));
			System.out.print(num[0] / num[1]);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
	}
}