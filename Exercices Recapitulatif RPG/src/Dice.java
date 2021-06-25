import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public Dice() {

    }

    public static byte rollMyDice(byte faces, byte times){
        byte total = 0;
        byte minimum = faces;
        byte temp = 0;

        for(int i = 0; i < times; i++) {
            temp = (byte) ThreadLocalRandom.current().nextInt(1, faces);
            total = (byte)(total + temp);

            minimum = (temp < minimum )? temp : minimum;
        }
        return (byte)(total - minimum);
    }

    @Override
    public String toString() {
        return "Dice{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
