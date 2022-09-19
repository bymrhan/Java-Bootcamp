public class switchCase {
    public static void main(String[] args) {

        /*Haftanın günlerini switch/case yapısı ile oluşturdum*/
        int gun = 2;
        switch(gun) {
            case 1:
                System.out.println("Bugün: PAZARTESİ");
                break;
            case 2:
                System.out.println("Bugün: SALI");
                break;
            case 3:
                System.out.println("Bugün: ÇARŞAMBA");
                break;
            case 4:
                System.out.println("Bugün: PERŞEMBE");
                break;
            case 5:
                System.out.println("Bugün: CUMA");
                break;
            case 6:
                System.out.println("Bugün: CUMARTESİ");
                break;
            case 7:
                System.out.println("Bugün: PAZAR");
                break;
            default:
                System.out.println("HATA");
                break;
        }
    }
}