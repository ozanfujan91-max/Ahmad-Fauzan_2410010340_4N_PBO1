package SistemPendapatanMahasiswa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa[] data = new Mahasiswa[100];

        int jumlah = 0;
        int pilihan = 0;

        do {

            System.out.println("\n====================================");
            System.out.println(" SISTEM PENDATAAN MAHASISWA ");
            System.out.println("====================================");
            System.out.println("1. Tambah Mahasiswa Aktif");
            System.out.println("2. Tambah Mahasiswa Beasiswa");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("4. Cari Mahasiswa");
            System.out.println("5. Hitung Rata-rata IPK");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {

                    case 1:

                        System.out.print("NPM : ");
                        String npm = input.nextLine();

                        System.out.print("Nama : ");
                        String nama = input.nextLine();

                        System.out.print("IPK : ");
                        double ipk = Double.parseDouble(input.nextLine());

                        System.out.print("Semester : ");
                        int semester = Integer.parseInt(input.nextLine());

                        data[jumlah] = new MahasiswaAktif(npm, nama, ipk, semester);
                        jumlah++;

                        System.out.println("\nData berhasil ditambahkan!");
                        break;

                    case 2:

                        System.out.print("NPM : ");
                        npm = input.nextLine();

                        System.out.print("Nama : ");
                        nama = input.nextLine();

                        System.out.print("IPK : ");
                        ipk = Double.parseDouble(input.nextLine());

                        System.out.print("Jenis Beasiswa : ");
                        String jenis = input.nextLine();

                        data[jumlah] = new MahasiswaBeasiswa(npm, nama, ipk, jenis);
                        jumlah++;

                        System.out.println("\nData berhasil ditambahkan!");
                        break;

                    case 3:

                        if (jumlah == 0) {

                            System.out.println("\nBelum ada data mahasiswa.");

                        } else {

                            System.out.println("\n===== DATA MAHASISWA =====");

                            for (int i = 0; i < jumlah; i++) {

                                System.out.println("--------------------------");
                                data[i].tampilData();

                            }

                        }

                        break;

                    case 4:

                        System.out.print("Masukkan NPM yang dicari : ");
                        String cari = input.nextLine();

                        boolean ketemu = false;

                        for (int i = 0; i < jumlah; i++) {

                            if (data[i].getNpm().equals(cari)) {

                                System.out.println("\nData ditemukan");
                                data[i].tampilData();
                                ketemu = true;
                                break;

                            }

                        }

                        if (!ketemu) {

                            System.out.println("Data tidak ditemukan.");

                        }

                        break;

                    case 5:

                        if (jumlah == 0) {

                            System.out.println("Belum ada data.");

                        } else {

                            double total = 0;

                            for (int i = 0; i < jumlah; i++) {

                                total += data[i].getIpk();

                            }

                            double rata = total / jumlah;

                            System.out.printf("Rata-rata IPK : %.2f\n", rata);

                        }

                        break;

                    case 6:

                        System.out.println("Terima kasih telah menggunakan program.");
                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");

                }

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka yang benar.");

            } catch (Exception e) {

                System.out.println("Terjadi kesalahan : " + e.getMessage());

            }

        } while (pilihan != 6);

        input.close();

    }

}