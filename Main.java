import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("admin", "123456"); 
        ManajemenKaryawan sistem = new ManajemenKaryawan();

        System.out.println("==================================");
        System.out.println("  APLIKASI MANAJEMEN DATA KARYAWAN ");
        System.out.println("==================================");

        // LOGIN
        boolean loginBerhasil = false;
        int percobaan = 0;

        while (!loginBerhasil && percobaan < 3) {
            System.out.print("Masukkan Username: ");
            String user = input.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = input.nextLine();

            if (admin.login(user, pass)) {
                loginBerhasil = true;
                System.out.println(" Login berhasil! Selamat datang.");
            } else {
                percobaan++;
                System.out.println(" Username atau password salah. silakan coba lagi (kesempatan percobaan 3 kali). (" + percobaan + "/3)");
            }
        }

        if (!loginBerhasil) {
            System.out.println(" Terlalu banyak percobaan! Program keluar.");
            return;
        }

        int pilihan;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Semua Karyawan");
            System.out.println("3. Ubah Data Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("0. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    sistem.tambahKaryawan();
                    break;
                case 2:
                    sistem.tampilkanSemua();
                    break;
                case 3:
                    sistem.ubahKaryawan();
                    break;
                case 4:
                    sistem.hapusKaryawan();
                    break;
                case 0:
                    System.out.println(" Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println(" Pilihan tidak ada!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
