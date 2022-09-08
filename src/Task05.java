import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        // генерация повторяемогодиапазона от стартовой точки seed
        long seed = 0;      //seed - переменная по умолчанию для задания стартовой части вызова данных
        Random random = new Random(seed);

        int bound = 100;        // граница
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(bound) + " ");
        }
    }
}
