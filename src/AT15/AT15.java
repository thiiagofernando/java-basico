package AT15;

public class AT15 {

	public static void main(String[] args) {

		int total = 0;
		int i;

		do {
			for (i = 2; i <= 100; i += 2) {
				total += i;
			}

			System.out.println(total);

		} while (i <= 100);

		System.out.println("FIM");

	}

}
