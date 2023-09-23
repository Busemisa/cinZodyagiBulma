import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumYili;

        System.out.print("Doğum yılınızı giriniz : ");
        dogumYili=input.nextInt();

        int indeks=dogumYili%12;
        String cinZodyagi = "";

        if (indeks == 0) {
            cinZodyagi = "Maymun";
        } else if (indeks == 1) {
            cinZodyagi = "Horoz";
        } else if (indeks == 2) {
            cinZodyagi = "Köpek";
        } else if (indeks == 3) {
            cinZodyagi = "Domuz";
        } else if (indeks == 4) {
            cinZodyagi = "Fare";
        } else if (indeks == 5) {
            cinZodyagi = "Öküz";
        } else if (indeks == 6) {
            cinZodyagi = "Tiger";
        } else if (indeks == 7) {
            cinZodyagi = "Tavşan";
        } else if (indeks == 8) {
            cinZodyagi = "Ejderha";
        } else if (indeks == 9) {
            cinZodyagi = "Yılan";
        } else if (indeks == 10) {
            cinZodyagi = "At";
        } else if (indeks == 11) {
            cinZodyagi = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

    }
}
