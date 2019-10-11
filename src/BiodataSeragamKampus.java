import java.util.Scanner;

public class BiodataSeragamKampus {
    public static void main(String[] args) {
        //Membuat Input Scanner
        //Biodata Seragam Kampus

        Scanner Biodata = new Scanner(System.in);
        System.out.println("...Tolong di isi bidodatanya ^^...");

        System.out.print("Masukkan Nama\t\t\t: ");
        String nama = Biodata.nextLine();

        System.out.print("Masukkan NIM\t\t\t: ");
        String NIM = Biodata.nextLine();

        System.out.print("Masukkan Nama Prodi\t\t: ");
        String prodi = Biodata.nextLine();

        System.out.print("Masukkan Ukuran Baju\t: ");
        String baju = Biodata.nextLine();

        System.out.print("Masukkan Ukuran Sepatu\t: ");
        int sepatu = Biodata.nextInt();

        //Output nya
        System.out.println();
        System.out.println("\t\t---BIODATA SERAGAM KAMPUS---\t\t");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + NIM);
        System.out.println("Prodi\t\t: " + prodi);
        System.out.println("Ukuran Baju\t: " + baju);
        System.out.println("No Sepatu\t: " + sepatu);

        //Kata - kata di akhir
        System.out.println("\t\t***TERIMA KASIH TELAH MENGISI***\t\t");
    }
}
