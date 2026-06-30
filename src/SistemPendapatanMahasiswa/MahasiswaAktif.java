package SistemPendapatanMahasiswa;

public class MahasiswaAktif extends Mahasiswa {

    private int semester;

    public MahasiswaAktif(String npm, String nama, double ipk, int semester) {
        super(npm, nama, ipk);
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void tampilData() {
        System.out.println("===== MAHASISWA AKTIF =====");
        super.tampilData();
        System.out.println("Semester : " + semester);
    }

}