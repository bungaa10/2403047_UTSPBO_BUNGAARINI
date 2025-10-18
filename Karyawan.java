public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String jabatan;
    private double gaji;

    
    public Karyawan(String idKaryawan, String nama, String jabatan, double gaji) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilkanData() {
    System.out.println("ID: " + idKaryawan);
    System.out.println("Nama: " + nama);
    System.out.println("Jabatan: " + jabatan);
    System.out.println("Gaji: " + (long) gaji); 
    System.out.println("========================");
}


}
