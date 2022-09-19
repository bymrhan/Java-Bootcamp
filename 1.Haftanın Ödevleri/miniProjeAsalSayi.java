import java.util.Random;
public class miniProjeAsalSayi {
    public static void main(String[] args) {
        Random r=new Random(); //random sınıfı
        int number =  r.nextInt(1000); //random sınıfından 1000'e kadar bir sayı üretir 1000 dahil değildir

        /*int remainder=number % 2;
        System.out.println(remainder);*/


        System.out.println("belirlenen sayı : " + number);
        boolean isPrime = true;
        
        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}