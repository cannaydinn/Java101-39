import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = {1, 7, 23, -3, 45, -12};
        System.out.print("Bir sayı giriniz : ");
        int number = sc.nextInt();

        System.out.println("Mevcut dizimiz : " + Arrays.toString(list));

        for(int i= 0; i < list.length; i++){

            if(number >= list[i] && number <= list[i+1]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i+1]);
                break;
            }
        }
    }
}