import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double boy,kilo,bodyMassIndex;
        Scanner input=new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz:");
        boy= input.nextDouble();
        System.out.print("kilonuzu giriniz:");
        kilo=input.nextDouble();
        bodyMassIndex=kilo/(boy*boy);
        System.out.print("vücut kitle indeksiniz="+bodyMassIndex);
    }
}
