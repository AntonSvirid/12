// :) - happy
// :( - bad
// :| - neutral
// :() - shouted
// :\ - nervous


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        Random random = new Random();

        int mood = random.nextInt(5);
        String msg = ":)";

        switch (mood) {
            case 1:
                msg = ":(";
                break;
            case 2:
                msg = ":|";
                break;
            case 3:
                msg = ":()";
                break;
            case 4:
                msg = ":/";
                break;
        }
        System.out.print(msg);
    }
}
