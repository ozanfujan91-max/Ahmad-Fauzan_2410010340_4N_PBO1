package uas.pbo;

public class Mahasiswa {

    private String npm;
    private String nama;
    private double ipk;

    public Mahasiswa() {

    }

    public Mahasiswa(String npm, String nama, double ipk) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void tampilData() {
        System.out.println("NPM  : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
    }

}