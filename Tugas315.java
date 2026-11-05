import java.util.Scanner;
public class Tugas315 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruhToko = 0;
            int tokoTerbaik = 1;
            int barangTerbanyak = -1;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + i
                        + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSeluruhToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = i;
                }
            }

            System.out.println("Total barang seluruh toko: "
                    + totalSeluruhToko);

            System.out.println("Toko dengan barang terbanyak: "
                    + tokoTerbaik);
        }
        sc.close();
    }
}