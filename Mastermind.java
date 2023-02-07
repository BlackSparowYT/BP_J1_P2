package BP-J1-P2;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int guess = 1;
		int checker = 0;
		int finished = 0;
		int difficulty = 0;
		int stopped = 0;

		int choiceColor[] = {0,0,0,0};
		int secret[] = {0,0,0,0};
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		
		
		System.out.println("\n\nWhat difficulty do you want to play? Normal = 1, Hard = 2"); 
		difficulty = sc.nextInt();

		while (difficulty < 1 || difficulty > 2) {
			System.out.println("Voer en 1 of 2 in.");
			difficulty = sc.nextInt();
		}

		if (difficulty == 1) {
			System.out.println("You have choicen the Normal difficulty.");
			System.out.println("On this difficulty, you can only use 1 specific color per guess. You need to guess 4 codes.");
			System.out.println("Have fun!");
		} else if (difficulty == 2) {
			System.out.println("You have choicen the Hard difficulty.");
			System.out.println("On this difficulty, you can use 1 specific color multiple times per guess. You need to guess 4 codes.");
			System.out.println("Good luck!");
		} 
		
		
		System.out.println("\nPut in the color to guess.");
		System.out.println("You can choice from:");
		System.out.println(" - Red = 1");
		System.out.println(" - Blue = 2");
		System.out.println(" - Green = 3");
		System.out.println(" - Purple = 4");
		System.out.println(" - Orange = 5");
		System.out.println(" - Yellow = 6");


		System.out.println("Use a number under -100 to quit the game!");
		
		
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
		int upperbound = 6;
		
		randomGetal cls = new randomGetal();
		
		// Random Number 1
		secret[a] = cls.randomNumber(upperbound, difficulty, secret);
		
		// Random Number 2
		secret[b] = cls.randomNumber(upperbound, difficulty, secret);
		
		
		// Random Number 3
		secret[c] = cls.randomNumber(upperbound, difficulty, secret);
		
		// Random Number 4
		secret[d] = cls.randomNumber(upperbound, difficulty, secret);

		// Voor debuggen bij het code maken.
		//System.out.println(secret[a] + "" + secret[b] + "" + secret[c] + "" + secret[d]);
		
		
		
		
		
		// // Main while loop voor de game
		
		while (guess < 11 && finished == 0 && stopped == 0) {
			
			
			// Zet de nodige variable op hun juiste waardes
			checker = 0;
			

			
			
			// Laat zien op welke beurt je bent
			System.out.println("\n\nYou are on guess " + guess + "/10");


			// Vraag voor de eerste kleur in voeren
			System.out.println("\nColor 1:");
			choiceColor[a] = sc.nextInt();
			
			// kijk of de player wilt stoppen
			if (choiceColor[a] == -100) {
				stopped = 1;
			}
			
			
			if (stopped == 0) {

				// bekijk naar wat opgegeven is binnen de juiste getallen valt
				if (difficulty == 1) {
					while (choiceColor[a] > 6 || choiceColor[a] < 1) {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 1:");
						choiceColor[a] = sc.nextInt();
					}
				}
				else if (difficulty == 2) {
					while (choiceColor[a] > 6 || choiceColor[a] < 1) {
						System.out.println("You can't put in a number above 6 or under 1");
						System.out.println("Color 1:");
						choiceColor[a] = sc.nextInt();
					}
				}






				// Vraag voor de tweede kleur in voeren
				System.out.println("Color 2:");
				choiceColor[b] = sc.nextInt();
				
				
				// kijk of de player wilt stoppen
				if (choiceColor[b] <= -100) {
					stopped = 1;
				}
				
				
				if (stopped == 0) {	
					// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
					if (difficulty == 1) {
						while (choiceColor[b] > 6 || choiceColor[b] < 1 || choiceColor[b] == choiceColor[a]) {
							if (choiceColor[b] == choiceColor[a]) {
								System.out.println("You can't put in the same number twice.");
								System.out.println("Color 2:");
								choiceColor[b] = sc.nextInt();
							}
							else {
								System.out.println("You can't put in a number above 6 or under 1");
								System.out.println("Color 2:");
								choiceColor[b] = sc.nextInt();
							}
						}
					}

					else if (difficulty == 2) {
						while (choiceColor[b] > 6 || choiceColor[b] < 1) {
							System.out.println("You can't put in a number above 6 or under 1");
							System.out.println("Color 2:");
							choiceColor[b] = sc.nextInt();
						}
					}
					


					// Vraag voor de derde kleur in voeren
					System.out.println("Color 3:");
					choiceColor[c] = sc.nextInt();
					
					// kijk of de player wilt stoppen
					if (choiceColor[c] <= -100) {
						stopped = 1;
					}
					
					
					if (stopped == 0) {	


						// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
						if (difficulty == 1) {
							while (choiceColor[c] > 6 || choiceColor[c] < 1 || choiceColor[c] == choiceColor[a] || choiceColor[c] == choiceColor[b]) {
								if (choiceColor[c] == choiceColor[a] || choiceColor[c] == choiceColor[b]) {
									System.out.println("You can't put in the same number twice.");
									System.out.println("Color 3:");
									choiceColor[c] = sc.nextInt();
								}
								else {
									System.out.println("You can't put in a number above 6 or under 1");
									System.out.println("Color 3:");
									choiceColor[c] = sc.nextInt();
								}
							}
						}
						
						else if (difficulty == 2) {
							while (choiceColor[c] > 6 || choiceColor[c] < 1 ) {
								System.out.println("You can't put in a number above 6 or under 1");
								System.out.println("Color 3:");
								choiceColor[c] = sc.nextInt();
							}
						}
						
						
						// Vraag voor de vierde kleur in voeren
						System.out.println("Color 4:");
						choiceColor[d] = sc.nextInt();

						// kijk of de player wilt stoppen
						if (choiceColor[d] <= -100) {
							stopped = 1;
						}
						
						
						if (stopped == 0) {	
							// bekijk naar wat opgegeven is binnen de juiste getallen valt of de zelfde getallen zijn als eerst
							if (difficulty == 1) {
								while (choiceColor[d] > 6 || choiceColor[d] < 1 || choiceColor[d] == choiceColor[a] || choiceColor[d] == choiceColor[b] || choiceColor[d] == choiceColor[c]) {
									if (choiceColor[d] == choiceColor[a] || choiceColor[d] == choiceColor[b] || choiceColor[d] == choiceColor[c]) {
										System.out.println("You can't put in the same number twice.");
										System.out.println("Color 4:");
										choiceColor[d] = sc.nextInt();
									}
									else {
										System.out.println("You can't put in a number above 6 or under 1");
										System.out.println("Color 4:");
										choiceColor[d] = sc.nextInt();
									}
								}
							}
							
							else if (difficulty == 2) {
								while (choiceColor[d] > 6 || choiceColor[d] < 1) {
									System.out.println("You can't put in a number above 6 or under 1");
									System.out.println("Color 4:");
									choiceColor[d] = sc.nextInt();
								}
							}





							
					
							
							// Check of kleur 1 gelijk is aan secret 1
							if (choiceColor[a] == secret[a]) {
								System.out.println("Color 1 is on the right place and is the right color.");
								checker = checker + 1;
							}
							// Check of kleur 1 gelijk is aan aan de andere secrets
							else if (choiceColor[a] == secret[b] || choiceColor[a] == secret[c] || choiceColor[a] == secret[d]) {
								System.out.println("Color 1 is not in the right place, but is the right color.");
							}
							else {
								System.out.println("Color 1 is not the right color neither is it in the right place.");
							}

							
							// Check of kleur 2 gelijk is aan secret 1
							if (choiceColor[b] == secret[b]) {
								System.out.println("Color 2 is on the right place and is the right color.");
								checker = checker + 1;
							}
							
							// Check of kleur 2 gelijk is aan aan de andere secrets
							else if (choiceColor[b] == secret[a] || choiceColor[b] == secret[c] || choiceColor[b] == secret[d]) {
								System.out.println("Color 2 is not in the right place, but is the right color.");
							}
							else {
								System.out.println("Color 2 is not the right color neither is it in the right place.");
							}
							
							
							// Check of kleur 3 gelijk is aan secret 1
							if (choiceColor[c] == secret[c]) {
								System.out.println("Color 3 is on the right place and is the right color.");
								checker = checker + 1;
							}
							
							// Check of kleur 3 gelijk is aan aan de andere secrets
							else if (choiceColor[c] == secret[a] || choiceColor[c] == secret[b] || choiceColor[c] == secret[d]) {
								System.out.println("Color 3 is not in the right place, but is the right color.");
							}
							else {
								System.out.println("Color 3 is not the right color neither is it in the right place.");
							}

							
							// Check of kleur 4 gelijk is aan secret 1
							if (choiceColor[d] == secret[d]) {
								System.out.println("Color 4 is on the right place and is the right color.");
								checker = checker + 1;
							}
							
							// Check of kleur 4 gelijk is aan aan de andere secrets
							else if (choiceColor[d] == secret[a] || choiceColor[d] == secret[b] || choiceColor[d] == secret[c]) {
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
					}
				}
			}
		}
		
		sc.close();
		

		/* shows the result if you have won or lost */
		
		if (guess < 11 && finished == 1) {
			System.out.println("You have won! :D");
		} else if (stopped == 1) {
			System.out.println("You stopped the game :(");
		} else {
			System.out.println("You lost :(");
			System.out.println("the correct code was: " + secret[a] + " " + secret[b] + " " + secret[c] + " " + secret[d]);
		}
	}
}
