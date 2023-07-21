import java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right =0;
        int selected ;
        int [] wrong = new int[5];
        boolean isWin =false;
        boolean isWrong = false;
        System.out.println(number);


        while (right < 5 ){
            System.out.print( "Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if(selected <0 || selected >100){
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if(isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız .Kalan hak : " +(5-(++right)));

                }else{

                    isWrong = true;
                    System.out.println("Bir daha hatalı girdiğinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if( selected == number ){
                System.out.println("Tebrikler dogru tahmin ettiniz ! Tahmin ettiğin sayı : " + number);
                isWin = true;
                break;
            }else{
                wrong[right] =selected;

                System.out.println("Hatalı bir sayı girdiniz !");
                if(selected>number){
                    System.out.println(selected + " sayısı , gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür. ");
                }
                right ++;
                System.out.println("Kalan hakkı : " + (5-right));
            }

        }

        if(!isWin ){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));


        }


    }
}