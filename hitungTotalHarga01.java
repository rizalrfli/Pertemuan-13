import java.util.Scanner;
public class hitungTotalHarga01 {
    public static int hitungTotalHarga (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 10000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Anda mendapatkan diskon 50%");
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")){
            hargaTotal *= 0.3;
            System.out.println("Anda mendapatkan diskon 30%");
        }
        else{
            System.out.println("Kode invalid");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lanjut;
        System.out.println("===================");
        System.out.println("Menu Makanan");
        System.out.println("===================");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh tarik - Rp 12.000");
        System.out.println("5. Roti bakar - Rp 10.000");
        System.out.println("6. Mie goreng - Rp 18.000");
        System.out.println();
        do{
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.println("Masukkan kode promo: ");
        String kodePromo = sc.next();
        System.out.println("\nLanjut pilih menu (y/n): ");
        lanjut = sc.next();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total Harga untuk pesanan anda :Rp " + totalHarga);
        if (lanjut.equalsIgnoreCase("y")){
            continue;
            }
        else if (lanjut.equalsIgnoreCase("n")){
            break;
            }
        } while (lanjut.equalsIgnoreCase("y"));
    }
}
