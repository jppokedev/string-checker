package application;

public class Verifier extends CheckLetter {

	public Verifier(String text) {
        super(text);
    }

    @Override
    public void check() {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The letter'a' (upper or lower case) " + count + " times.");
        } else {
            System.out.println("The letter 'a' (upper or lower case) was not found.");
        }
    }
}
	

