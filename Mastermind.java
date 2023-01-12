package mastermind;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		//System.out.println(secret1 + "\n" + secret2 + "\n" + secret3 + "\n" + secret4);
		
		Scanner sc = new Scanner(System.in);
		
		int guess = 1;
		int checker = 0;
		int finished = 0;
		
		int choiceColor1 = 0;
		int choiceColor2 = 0;
		int choiceColor3 = 0;
		int choiceColor4 = 0;
		
		int difficulty = 0;
		
		
		System.out.println("\n\nWhat difficulty do you want to play? Normal = 1, Hard = 2*, Extreme = 3*, Insane = 4*, Insane V2 = 5*, HELL = 6* (* = is not yet fully functional!)");
		difficulty = sc.nextInt();
		if (difficulty == 1) {
			System.out.println("You have choicen the Normal difficulty.");
			System.out.println("On this difficulty, you can only use 1 specific color per guess. You need to guess 4 codes.");
			System.out.println("Have fun!");
		} else if (difficulty == 2) {
			System.out.println("You have choicen the Hard difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess. You need to guess 4 codes.");
			System.out.println("Good luck!");
		} else if (difficulty == 3) {
			System.out.println("You have choicen the Extreme difficulty.");
			System.out.println("On this difficulty, you can only use 1 specific color per guess. You need to guess 6 codes.");
			System.out.println("Good luck!");
		} else if (difficulty == 4) {
			System.out.println("You have choicen the Insane difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess. You need to guess 6 codes.");
			System.out.println("Good luck!");
		} else if (difficulty == 5) {
			System.out.println("You have choicen the Insane V2 difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess. You need to guess 12 codes.");
			System.out.println("Good luck!");
		} else if (difficulty == 6) {
			System.out.println("You have choicen the HELL difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess. You need to guess 24 codes. You only have 5 tries though!");
			System.out.println("Good luck! (You will need it :p)");
		}
		
		if (difficulty == 1) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("You can choice from:");
			System.out.println(" - Red = 1");
			System.out.println(" - Blue = 2");
			System.out.println(" - Green = 3");
			System.out.println(" - Purple = 4");
			System.out.println(" - Orange = 5");
			System.out.println(" - Yellow = 6");
		} else if (difficulty == 2) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("You can choice from:");
			System.out.println(" - Red = 1");
			System.out.println(" - Blue = 2");
			System.out.println(" - Green = 3");
			System.out.println(" - Purple = 4");
			System.out.println(" - Orange = 5");
			System.out.println(" - Yellow = 6");
		} else if (difficulty == 3) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("You can choice from:");
			System.out.println(" - Red = 1");
			System.out.println(" - Blue = 2");
			System.out.println(" - Green = 3");
			System.out.println(" - Purple = 4");
			System.out.println(" - Orange = 5");
			System.out.println(" - Yellow = 6");
			System.out.println(" - Pink = 6");
			System.out.println(" - Cyan = 7");
		} else if (difficulty == 4) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("You can choice from:");
			System.out.println(" - Red = 1");
			System.out.println(" - Blue = 2");
			System.out.println(" - Green = 3");
			System.out.println(" - Purple = 4");
			System.out.println(" - Orange = 5");
			System.out.println(" - Yellow = 6");
			System.out.println(" - Pink = 6");
			System.out.println(" - Cyan = 7");
		} else if (difficulty == 5) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("You can choice from:");
			System.out.println(" - Red = 1");
			System.out.println(" - Blue = 2");
			System.out.println(" - Green = 3");
			System.out.println(" - Purple = 4");
			System.out.println(" - Orange = 5");
			System.out.println(" - Yellow = 6");
			System.out.println(" - Pink = 6");
			System.out.println(" - Cyan = 7");
			System.out.println(" - brown = 8");
			System.out.println(" - Cyan = 9");
			System.out.println(" - Vermilion = 10");
			System.out.println(" - Blue Jeans = 11");
			System.out.println(" - Liver Dogs = 12");
			System.out.println(" - Dark Purple = 13");
			System.out.println(" - Oxford Blue = 12");
		} else if (difficulty == 6) {
			System.out.println("\nPut in the color to guess.");
			System.out.println("\nSince you have choicen hell, go fuck yourself and use hex codes for colors.");
			System.out.println("You can choice from:");
			System.out.println(" - #A6E1FA = 1");
			System.out.println(" - #4E6766 = 2");
			System.out.println(" - #5AB1BB = 3");
			System.out.println(" - #A5C882 = 4");
			System.out.println(" - #F7DD72 = 5");
			System.out.println(" - #E29578 = 6");
			System.out.println(" - #83C5BE = 6");
			System.out.println(" - #006D77 = 7");
			System.out.println(" - #BFADA3 = 8");
			System.out.println(" - #FBB7C0 = 9");
			System.out.println(" - #504746 = 10");
			System.out.println(" - #26081C = 11");
			System.out.println(" - #0E6BA8 = 12");
			System.out.println(" - #381D2A = 13");
			System.out.println(" - #AABD8C = 14");
			System.out.println(" - #01BAEF = 15");
			System.out.println(" - Russian Violet (#380036) = 16");
			System.out.println(" - #150811 = 17");
			System.out.println(" - #B6CB9E = 18");
			System.out.println(" - #4C5B5C = 19");
			System.out.println(" - #DB5461 = 20");
			System.out.println(" - #FBBFCA = 21");
			System.out.println(" - #875053 = 22");
			System.out.println(" - #75DBCD = 23");
			System.out.println(" - #DCDBA8 = 24");
			System.out.println(" - #89043D = 25");
			System.out.println(" - #1C3041 = 26");
		}
		
		
		
		
		
		
		
		// Activate only when debugging/developing
		
		//int isDeveloper = 0;
		//int skip = 0;
		//int wantToWin = 0;
		
		//System.out.println("\n\nAre you a developer? (yes = 1, no = 0)");
		//isDeveloper = sc.nextInt();
		//if (isDeveloper == 1) {
		//	System.out.println("Want to skip the game? (yes = 1, no = 0)");
		//	skip = sc.nextInt();
		//	if (skip == 1) {
		//		System.out.println("Do you want to skip and win or lose the game? (win = 1, lose = 0)");
		//		wantToWin = sc.nextInt();
		//		if (wantToWin == 1) {
		//			finished = 1;
		//		}
		//		else {
		//			guess = 11;
		//		}
		//	}
		//}
		
		
		
		
		
		
		// // Random Number Generator
		
		// Make a random number
		Random randomNumber = new Random();
		int upperbound = 6;
		
		
		// Random Number 1
		int secret1 = randomNumber.nextInt(upperbound);
		while (secret1 < 1) {
			secret1 = randomNumber.nextInt(upperbound);
		}
		
		
		// Random Number 2
		int secret2 = randomNumber.nextInt(upperbound);
		if (difficulty == 1) {
			while (secret2 == secret1 || secret2 < 1) {
				secret2 = randomNumber.nextInt(upperbound);
			}
		}
		else if (difficulty == 2) {
			while (secret2 < 1) {
				secret2 = randomNumber.nextInt(upperbound);
			}
		}
		
		
		// Random Number 3
		int secret3 = randomNumber.nextInt(upperbound);
		if (difficulty == 1) {
			while (secret3 == secret1 || secret3 == secret2 || secret3 < 1) {
				secret3 = randomNumber.nextInt(upperbound);
			}
		}
		else if (difficulty == 2) {
			while (secret3 < 1) {
				secret3 = randomNumber.nextInt(upperbound);
			}
		}
		
		
		// Random Number 4
		int secret4 = randomNumber.nextInt(upperbound);
		if (difficulty == 1) {
			while (secret4 == secret1 || secret4 == secret2 || secret4 == secret3 || secret4 < 1) {
				secret4 = randomNumber.nextInt(upperbound);
			}
		}
		else if (difficulty == 2) {
				while (secret4 < 1) {
				secret4 = randomNumber.nextInt(upperbound);
				}
		}
		
		
		
		
		
		// // Main while loop voor de game
		
		while (guess < 11 && finished == 0) {
			
			
			// Zet de nodige variable op hun juiste waardes
			checker = 0;
			
			
			
			// Laat zien op welke beurt je bent
			System.out.println("\n\nYou are on guess " + guess + "/10");
			
			
			
			
			// Vraag voor de eerste kleur in voeren
			System.out.println("\nColor 1:");
			choiceColor1 = sc.nextInt();
			
			
			// bekijk naar wat opgegeven is binnen de juiste getallen valt
			if (difficulty == 1) {
				while (choiceColor1 > 6 || choiceColor1 < 1) {
					System.out.println("You can't put in a number above 6 or under 1");
					System.out.println("Color 1:");
					choiceColor1 = sc.nextInt();
				}
			}
			else if (difficulty == 2) {
				while (choiceColor1 > 6 || choiceColor1 < 1) {
					System.out.println("You can't put in a number above 6 or under 1");
					System.out.println("Color 1:");
					choiceColor1 = sc.nextInt();
				}
			}

			
			
			// Vraag voor de tweede kleur in voeren
			System.out.println("Color 2:");
			choiceColor2 = sc.nextInt();
			
			// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
			if (difficulty == 1) {
				while (choiceColor2 > 6 || choiceColor2 < 1 || choiceColor2 == choiceColor1) {
					if (choiceColor2 == choiceColor1) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
				}
			}
			else if (difficulty == 2) {
				while (choiceColor2 > 6 || choiceColor2 < 1) {
					if (choiceColor2 == choiceColor1) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 2:");
						choiceColor2 = sc.nextInt();
					}
				}
			}
			
			
			
			// Vraag voor de derde kleur in voeren
			System.out.println("Color 3:");
			choiceColor3 = sc.nextInt();
			
			// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
			if (difficulty == 1) {
				while (choiceColor3 > 6 || choiceColor3 < 1 || choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
					if (choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
				}
			}
			
			else if (difficulty == 2) {
				while (choiceColor3 > 6 || choiceColor3 < 1 ) {
					if (choiceColor3 == choiceColor1 || choiceColor3 == choiceColor2) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 3:");
						choiceColor3 = sc.nextInt();
					}
				}
			}
			
			
			// Vraag voor de vierde kleur in voeren
			System.out.println("Color 4:");
			choiceColor4 = sc.nextInt();
			
			// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
			if (difficulty == 1) {
				while (choiceColor4 > 6 || choiceColor4 < 1 || choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
					if (choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 4:");
						choiceColor4 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 4:1");
						choiceColor4 = sc.nextInt();
					}
				}
			}
			
			else if (difficulty == 1) {
				while (choiceColor4 > 6 || choiceColor4 < 1) {
					if (choiceColor4 == choiceColor1 || choiceColor4 == choiceColor2 || choiceColor4 == choiceColor3) {
						System.out.println("You can't put in the same number twice.");
						System.out.println("Color 4:");
						choiceColor4 = sc.nextInt();
					}
					else {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 4:1");
						choiceColor4 = sc.nextInt();
					}
				}
			}
			
			
			
			
			
			
			// Check of kleur 1 gelijk is aan secret 1
			if (choiceColor1 == secret1) {
				System.out.println("Color 1 is on the right place and is the right color.");
				checker = checker + 1;
			}
			// Check of kleur 1 gelijk is aan aan de andere secrets
			else if (choiceColor1 == secret2 || choiceColor1 == secret3 || choiceColor1 == secret4) {
				System.out.println("Color 1 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 1 is not the right color neither is it in the right place.");
			}
			
			
			
			
			
			
			// Check of kleur 2 gelijk is aan secret 1
			if (choiceColor2 == secret2) {
				System.out.println("Color 2 is on the right place and is the right color.");
				checker = checker + 1;
			}
			
			// Check of kleur 2 gelijk is aan aan de andere secrets
			else if (choiceColor2 == secret1 || choiceColor2 == secret3 || choiceColor2 == secret4) {
				System.out.println("Color 2 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 2 is not the right color neither is it in the right place.");
			}
			
			
			
			
			
			// Check of kleur 3 gelijk is aan secret 1
			if (choiceColor3 == secret3) {
				System.out.println("Color 3 is on the right place and is the right color.");
				checker = checker + 1;
			}
			
			// Check of kleur 3 gelijk is aan aan de andere secrets
			else if (choiceColor3 == secret1 || choiceColor3 == secret2 || choiceColor3 == secret4) {
				System.out.println("Color 3 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 3 is not the right color neither is it in the right place.");
			}
			
			
			
			
			// Check of kleur 4 gelijk is aan secret 1
			if (choiceColor4 == secret4) {
				System.out.println("Color 4 is on the right place and is the right color.");
				checker = checker + 1;
			}
			
			// Check of kleur 4 gelijk is aan aan de andere secrets
			else if (choiceColor4 == secret1 || choiceColor4 == secret2 || choiceColor4 == secret3) {
				System.out.println("Color 4 is not in the right place, but is the right color.");
			}
			else {
				System.out.println("Color 4 is not the right color neither is it in the right place.");
			}
			
			
			
			
			
			// Check of alle kleuren correct zijn
			if (checker >= 4) {
				System.out.println("All colors are correct!");
				finished = 1;
			}
			// Als niet alle kleuren correct zijn doe + 1 beurt
			else {
				System.out.println("No or not all colors are correct, try again if you have guesses left!");
				guess++;
			}
			
		}
		
		
		sc.close();
		
		/* shows the result if you have won or lost */
		
		if (guess < 11 && finished == 1) {
			System.out.println("You have won! :D");
		}
		else {
			System.out.println("You lost :(");
			System.out.println("the correct code was: " + secret1 + " " + secret2 + " " + secret3 + " " + secret4);
		}
	}

}
