package uas.pbo;

public class MahasiswaBeasiswa extends Mahasiswa {

    private String jenisBeasiswa;

    public MahasiswaBeasiswa(String npm, String nama, double ipk, String jenisBeasiswa) {
        super(npm, nama, ipk);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public String getJenisBeasiswa() {
        return jenisBeasiswa;
    }

    public void setJenisBeasiswa(String jenisBeasiswa) {
        this.jenisBeasiswa = jenisBeasiswa;
    }

    @Override
    public void tampilData() {
        System.out.println("===== MAHASISWA BEASISWA =====");
        super.tampilData();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
    }

}