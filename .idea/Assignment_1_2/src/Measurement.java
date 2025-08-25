import  java.util.Scanner;
public class Measurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight in grams: ");
        double weightGram = scanner.nextDouble();

        double le = Math.floor(weightGram/(13.28*32*20));
        double na = Math.floor((weightGram/(13.28*32*20)-le )* 20) ;
        double lu = (((weightGram/(13.28*32*20)-le )* 20)-na)*32 ;

        System.out.printf("%.0f gram is %.0f leiviska, %.0f30 of naula, and %.2f luoti.",weightGram,le,na,lu);


    }
}