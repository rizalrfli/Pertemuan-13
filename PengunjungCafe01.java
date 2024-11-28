public class PengunjungCafe01 {
    public static void daftarPengunjung (String... namaPengunjung){
        System.out.println("Daftar nama pengunjung:");
        for (String namaPendatang : namaPengunjung) {
            System.out.println(namaPendatang);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung ("Ali", "Budi", "Citra");
    }
}
