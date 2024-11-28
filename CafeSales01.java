import java.util.Scanner;

public class CafeSales01 {

    public static void main(String[] args) {
       
        // Data penjualan
        int[][] sales = new int[5][7];
        // Menu
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        // Input data penjualan
        inputSales(sales, menu);

        // Menampilkan data penjualan
       tampilanPenjualan(sales, menu);

       // Menampilkan menu dengan penjualan tertinggi
       menuTertinggi(sales, menu);

       // Menampilkan rata-rata penjualan
       rataPenjualan(sales, menu);
    
    }

    // Fungsi untuk meninputkan data penjualan
    public static void inputSales(int[][] sales, String[] menu) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Penjualan " + menu[i] + ":");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Hari ke " + (j + 1) + ": ");
                sales[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilanPenjualan(int[][] sales, String[] menu) {
    System.out.println("Data Penjualan:");
    System.out.println("Menu\tHari 1\tHari 2\tHari 3\tHari 4\tHari 5\t\tHari 6\t\tHari 7");
    for (int i = 0; i < sales.length; i++) {
        System.out.print(menu[i] + "\t\t");
        for (int j = 0; j < sales[i].length; j++) {
            System.out.print(sales[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuTertinggi(int[][] sales, String[] menu) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > max) {
                    max = sales[i][j];
                    index = i;
                }
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + menu[index]);
    }

    // Fungsi untuk menampilkan rata-rata penjualan
    public static void rataPenjualan(int[][] sales, String[] menu) {
        int total = 0;  
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        System.out.println("Rata-rata penjualan: " + (double)total / (sales.length * sales[0].length));
        }
}