public class DataMahasiswa {
    Mahasiswa[] mhs;

    // Konstruktor untuk inisialisasi jumlah elemen array
    DataMahasiswa(int elemen) {
        mhs = new Mahasiswa[elemen];
    }

    // a) Method mencari Nilai UTS Tertinggi (Divide and Conquer)
    int maxUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS; // Base case
        }
        
        int mid = (l + r) / 2;
        int lMax = maxUTSDC(arr, l, mid);
        int rMax = maxUTSDC(arr, mid + 1, r);
        
        // mengembalikan nilai yang lebih besar
        if (lMax > rMax) {
            return lMax;
        } else {
            return rMax;
        }
    }

    // Method mencari Nilai UTS Terendah (Divide and Conquer)
    int minUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS; // Base case
        }
        
        int mid = (l + r) / 2;
        int lMin = minUTSDC(arr, l, mid);
        int rMin = minUTSDC(arr, mid + 1, r);
        
        //  mengembalikan nilai yang lebih kecil
        if (lMin < rMin) {
            return lMin;
        } else {
            return rMin;
        }
    }

    // Method mencari Rata-rata Nilai UAS (Brute Force)
    double rataUASBF() {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}