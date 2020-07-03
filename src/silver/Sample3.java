package silver;

/**
 * try-catch-finally構文
 * @author TAKANAMI
 *
 */
public class Sample3 {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30 };
		for (int i = 0; i < 4; i++) {
			try {
				System.out.print("num :" + num[i]); // 4回目はここで例外が発生する
				System.out.println(" : " + (i + 1) + "回目のループ"); // 4回目はこの処理をスキップする
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("例外が発生しました"); // 4回目のみ通る
			} finally {
				System.out.println("-- finallyの実行"); // 必ず通る
			}
		}
		System.out.println("-- end --");
	}
}