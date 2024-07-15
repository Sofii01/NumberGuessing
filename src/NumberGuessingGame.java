import java.util.Random;
public class NumberGuessingGame {

        public static int numberGenerate() {
                Random rand = new Random();
            return rand.nextInt(100) + 1;
        }



}
