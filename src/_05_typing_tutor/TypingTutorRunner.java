package _05_typing_tutor;

import java.util.Random;

public class TypingTutorRunner {
public static void main(String[] args) {

new	TypingTutor().typing();
	
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
    currentLetter = generateRandomLetter();

}
}
