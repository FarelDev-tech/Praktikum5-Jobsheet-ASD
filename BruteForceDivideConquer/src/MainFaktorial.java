import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        
        System.out.print("Masukkan Nilai: ");
        nilai = sc.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial" + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial" + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
