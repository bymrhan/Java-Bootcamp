public class recapDemo2 {
    public static void main(String[] args) {
        double[] myList = { 1.2, 6.3, 4.3, 5.6 };
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number)
            {max = number;}

            total += number;
            System.out.println("Number :" + number);
        }
        System.out.println("Toplam :" + total);
        System.out.println("En Büyük :" + max);
    }
}
