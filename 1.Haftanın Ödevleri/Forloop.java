public class Forloop {
    public static void main(String[] args) {
        /*Derste Anlatılanlar*/
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        /*Tek Sayılar*/
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        /*Çift Sayılar*/
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");
    }
}