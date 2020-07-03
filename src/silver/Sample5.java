package silver;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ライブラリ使用時の注意
 * @author TAKANAMI
 *
 */
public class Sample5 {
	public static void main(String[] args) throws FileNotFoundException {
		//例外処理は任意
		int i = Integer.parseInt("10");
		System.out.println(i); // 10

		//例外処理は必須
		FileReader r = new FileReader("Test.txt"); // FileNotFoundException
	}
}