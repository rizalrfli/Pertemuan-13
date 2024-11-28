public class Kafe01 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("Selamat datang " + namaPelanggan + "!");
        System.out.println("Kode Promo: " + kodePromo);

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% untuk setiap pembelian");
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% untuk setiap pembelian");
        }
        else  {
            System.out.println("Kode invalid");
        }

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembeliaan");
        }

        System.out.println("====== MENU RESTO KAFFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("Cappucino - Rp 20.000");
        System.out.println("Latte - Rp 22.000");
        System.out.println("Teh tarik - Rp 12.000");
        System.out.println("Roti bakar - Rp 10.000");
        System.out.println("Mie goreng - Rp 18.000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
}