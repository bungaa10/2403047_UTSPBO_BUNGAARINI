import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKaryawan {
 
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    
    public void tambahKaryawan() {
        System.out.println("\n--- Tambah Data Karyawan ---");
        System.out.print("Masukkan ID Karyawan: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukkan Gaji: ");
        double gaji = input.nextDouble();
        input.nextLine(); 
        
        Karyawan k = new Karyawan(id, nama, jabatan, gaji);
        daftarKaryawan.add(k);
        System.out.println(" Data karyawan berhasil ditambahkan!");
    }

   
    public void tampilkanSemua() {
        System.out.println("\n====== Daftar Karyawan ======");
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            for (Karyawan k : daftarKaryawan) {
                k.tampilkanData();
            }
        }
    }

    
    public void hapusKaryawan() {
        System.out.println("\n==== Hapus Data Karyawan ====");
        System.out.print("Masukkan ID Karyawan: ");
        String id = input.nextLine();
        boolean ditemukan = false;

        for (Karyawan k : daftarKaryawan) {
            if (k.getIdKaryawan().equalsIgnoreCase(id)) {
                daftarKaryawan.remove(k);
                System.out.println(" Data berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println(" Data tidak ditemukan.");
        }
    }

    public void ubahKaryawan() {
        System.out.println("\n=== Ubah Data Karyawan ===");
        System.out.print("Masukkan ID Karyawan: ");
        String id = input.nextLine();

        for (Karyawan k : daftarKaryawan) {
            if (k.getIdKaryawan().equalsIgnoreCase(id)) {
                System.out.print("Nama baru: ");
                String namaBaru = input.nextLine();
                System.out.print("Jabatan baru: ");
                String jabatanBaru = input.nextLine();
                System.out.print("Gaji baru: ");
                double gajiBaru = input.nextDouble();
                input.nextLine();

                k.setNama(namaBaru);
                k.setJabatan(jabatanBaru);
                k.setGaji(gajiBaru);
                System.out.println(" Data berhasil diubah!");
                return;
            }
        }
        System.out.println(" Data tidak ditemukan.");
    }
}
