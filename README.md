# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana **Sistem Pendataan Mahasiswa** menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data mahasiswa berdasarkan jenisnya, yaitu **Mahasiswa Aktif** dan **Mahasiswa Beasiswa**. Pengguna dapat menambahkan data mahasiswa, menampilkan seluruh data mahasiswa, mencari mahasiswa berdasarkan NPM, menghitung rata-rata IPK, serta keluar dari program.

Aplikasi ini menerapkan konsep-konsep dasar Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

---

# Penjelasan Kode

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat object.

Pada project ini terdapat class:

```java
public class Mahasiswa {
    ...
}

public class MahasiswaAktif extends Mahasiswa {
    ...
}

public class MahasiswaBeasiswa extends Mahasiswa {
    ...
}

public class Main {
    ...
}
```

---

## 2. Object

Object dibuat dari class menggunakan keyword `new`.

```java
data[jumlah] = new MahasiswaAktif(npm, nama, ipk, semester);

data[jumlah] = new MahasiswaBeasiswa(npm, nama, ipk, jenis);
```

---

## 3. Atribut

Atribut merupakan data yang dimiliki oleh class.

```java
private String npm;
private String nama;
private double ipk;
```

Pada class turunan terdapat atribut tambahan.

```java
private int semester;
```

dan

```java
private String jenisBeasiswa;
```

---

## 4. Constructor

Constructor digunakan saat object dibuat.

```java
public Mahasiswa(String npm, String nama, double ipk){
    this.npm = npm;
    this.nama = nama;
    this.ipk = ipk;
}
```

```java
public MahasiswaAktif(String npm, String nama, double ipk, int semester){
    super(npm, nama, ipk);
    this.semester = semester;
}
```

```java
public MahasiswaBeasiswa(String npm, String nama, double ipk, String jenisBeasiswa){
    super(npm, nama, ipk);
    this.jenisBeasiswa = jenisBeasiswa;
}
```

---

## 5. Mutator (Setter)

Setter digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama){
    this.nama = nama;
}

public void setNpm(String npm){
    this.npm = npm;
}

public void setIpk(double ipk){
    this.ipk = ipk;
}
```

---

## 6. Accessor (Getter)

Getter digunakan untuk mengambil nilai atribut.

```java
public String getNpm(){
    return npm;
}

public String getNama(){
    return nama;
}

public double getIpk(){
    return ipk;
}
```

---

## 7. Encapsulation

Encapsulation diterapkan dengan membuat atribut menjadi `private`, sehingga hanya dapat diakses menggunakan method getter dan setter.

```java
private String npm;
private String nama;
private double ipk;
```

---

## 8. Inheritance

Inheritance diterapkan menggunakan keyword `extends`.

```java
public class MahasiswaAktif extends Mahasiswa{
    ...
}

public class MahasiswaBeasiswa extends Mahasiswa{
    ...
}
```

---

## 9. Polymorphism

Polymorphism diterapkan menggunakan **Method Overriding** pada method `tampilData()`.

```java
@Override
public void tampilData(){
    System.out.println("===== MAHASISWA AKTIF =====");
    super.tampilData();
    System.out.println("Semester : " + semester);
}
```

```java
@Override
public void tampilData(){
    System.out.println("===== MAHASISWA BEASISWA =====");
    super.tampilData();
    System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
}
```

---

## 10. Seleksi

Seleksi menggunakan `switch-case` pada menu utama serta `if-else` pada proses pencarian data dan pengecekan jumlah data.

```java
switch(pilihan){
    case 1:
        ...
        break;

    case 2:
        ...
        break;

    default:
        System.out.println("Menu tidak tersedia.");
}
```

---

## 11. Perulangan

Perulangan menggunakan `for` untuk menampilkan data, mencari mahasiswa, dan menghitung rata-rata IPK.

```java
for(int i = 0; i < jumlah; i++){
    data[i].tampilData();
}
```

---

## 12. Input Output Sederhana

Input menggunakan class `Scanner`.

```java
Scanner input = new Scanner(System.in);
```

Output menggunakan:

```java
System.out.print();
System.out.println();
System.out.printf();
```

---

## 13. Array

Array digunakan untuk menyimpan banyak object mahasiswa.

```java
Mahasiswa[] data = new Mahasiswa[100];
```

---

## 14. Error Handling

Error Handling menggunakan `try-catch` untuk menangani kesalahan input.

```java
try{

    pilihan = Integer.parseInt(input.nextLine());

}catch(NumberFormatException e){

    System.out.println("Input harus berupa angka yang benar.");

}catch(Exception e){

    System.out.println("Terjadi kesalahan : " + e.getMessage());

}
```

---

# Fitur Program

- Menambah Mahasiswa Aktif
- Menambah Mahasiswa Beasiswa
- Menampilkan seluruh data mahasiswa
- Mencari mahasiswa berdasarkan NPM
- Menghitung rata-rata IPK
- Menangani kesalahan input
- Keluar dari program

---

# Usulan Nilai

| No | Materi | Nilai |
|:--:|----------------|:----:|
|1|Class|5|
|2|Object|5|
|3|Atribut|5|
|4|Constructor|5|
|5|Mutator|5|
|6|Accessor|5|
|7|Encapsulation|5|
|8|Inheritance|5|
|9|Polymorphism|10|
|10|Seleksi|5|
|11|Perulangan|5|
|12|Input Output Sederhana|10|
|13|Array|15|
|14|Error Handling|15|
||**TOTAL**|**100**|

---

# Pembuat

**Nama : Ahmad Fauzan**

**NPM : 2410010340**

**Kelas : 4N Reguler Banjarmasin**

**Mata Kuliah : Pemrograman Berbasis Objek 1**
