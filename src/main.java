import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        int n,total=0;

        Scanner inp = new Scanner (System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            n = inp.nextInt();
            if(n % 4 == 0){
                total += n;
            }
        }while(n % 2 == 0);

        System.out.println("4 ün katları olan sayıların toplamı : " + total);
    }
}