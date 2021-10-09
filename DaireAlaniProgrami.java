package Pratik5;
import java.util.Scanner;
public class DaireAlaniProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r,alan,merkezaci,pi=3.14;

        System.out.print("Yarıçapı Giriniz:");
        r=input.nextInt();

        System.out.print("Merkez Açıının Ölçüsünü Giriniz:");
        merkezaci=input.nextInt();

        alan=(pi*(r*r)*merkezaci)/360;

        System.out.println("Alan:"+alan);
    }


}
