import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
//        // генерируем целые значения
//        for (int i = 0; i < 10; i++) {      //dspjd wbrkf gjdnjhtybz c ghteckjdbtv - dsdjl 10 cnhjr
//            System.out.print(random.nextInt() + " ");
//        }     // создание рандомного числа от 0 до 100 не включая прав границу
//    int bound = 100;
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt(bound) + " ");

        // создание рандомного числа от 0 до 100 включая прав границу
        int a = 10;
        int b = 30;
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(b - a + 1) + a + " ");
        }
    }
}
