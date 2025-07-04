package herbertschildt;
public class FSDemo {

	public static void main(String[] args) {

		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		// exibe falhas silenciosas
		System.out.println("Fail quietly");

		for (int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i * 10);

		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1)
				System.out.println(x + " ");
		}
		System.out.println("");

		// Agora, trata as falhas
		System.out.println("\nFail with error reports.");
		for (int i = 0; i < (fs.length * 2); i++)
			if (!fs.put(i, i * 10))
				System.out.println("Index " + i + " out-of-bounds");

		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1)
				System.out.print(x + " ");
			else
				System.out.println("Index " + i + " out-of-bound");
		}
	}

}
