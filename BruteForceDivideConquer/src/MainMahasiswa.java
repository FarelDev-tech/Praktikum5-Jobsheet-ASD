public class MainMahasiswa {
    public static void main(String[] args) {
        // Instansiasi objek DataMahasiswa dengan 8 elemen
        DataMahasiswa data = new DataMahasiswa(8);

        // Memasukkan data ke dalam array mhs sesuai tabel
        data.mhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        data.mhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        data.mhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        data.mhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        data.mhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        data.mhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        data.mhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        data.mhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);


        System.out.println("=== HASIL PERHITUNGAN DATA MAHASISWA ===");
        
        // a) Output UTS Tertinggi
        int tertinggiUTS = data.maxUTSDC(data.mhs, 0, data.mhs.length - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + tertinggiUTS);
        
        // b) Output UTS Terendah
        int terendahUTS = data.minUTSDC(data.mhs, 0, data.mhs.length - 1);
        System.out.println("b) Nilai UTS Terendah (Divide and Conquer) : " + terendahUTS);
        
        // c) Output Rata-rata UAS
        double rataRataUAS = data.rataUASBF();
        System.out.println("c) Rata-rata Nilai UAS (Brute Force)       : " + rataRataUAS);
    }
}