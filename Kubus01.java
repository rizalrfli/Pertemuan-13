import java.util.Scanner;
public class Kubus01 {
    public static int volumeKubus(int sisi) {
        sisi = sisi * sisi * sisi;
        return sisi;
    }
    public static int lpKubus(int sisi) {
        sisi = sisi * 12;
        return sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s;
        System.out.print("Masukkan sisi kubus: ");
        s = sc.nextInt();
        System.out.println("Volume kubus: " + volumeKubus(s));
        System.out.println("Luas permukaan kubus: " + lpKubus(s));
    }
}
