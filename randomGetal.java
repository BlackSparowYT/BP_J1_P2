package BP_J1_P2;
import java.util.Random;

public class randomGetal {
    public int randomNumber (int upperbound, int difficulty, int secret[]) {
	
		Random randomNumber = new Random();
		int randomCode = 0;

		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;

		randomCode = randomNumber.nextInt(upperbound);
		if (difficulty == 1) {
			while (randomCode == secret[a] || randomCode == secret[b] || randomCode == secret[c]  || randomCode == secret[d] || randomCode < 1) {
				randomCode = randomNumber.nextInt(upperbound);
			}
		} else if (difficulty == 2) {
			while (randomCode < 1) {
				randomCode = randomNumber.nextInt(upperbound);
			}
		}

		return randomCode;
	}
}
