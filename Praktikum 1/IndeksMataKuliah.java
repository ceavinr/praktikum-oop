/**
 * MataKuliah.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18221162 Ceavin Rufus De Prayer Purba
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;

    /**
     * Konstruktor
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nama, Double nilai) {
        this.mataKuliah = mk;
        this.nama = nama;
        this.nilai = nilai;
        if (nilai == 4.0){
            this.indeks = "A";
        } else if ((nilai >= 3.0) && (nilai < 4.0)){
            this.indeks = "B";
        } else if ((nilai >= 2.0) && (nilai < 3.0)){
            this.indeks = "C";
        } else if ((nilai >= 1.0) && (nilai < 2.0)){
            this.indeks = "D";
        } else if ((nilai >= 0.0) && (nilai < 1.0)){
            this.indeks = "E";
        } else {
            this.nilai = 0.0;
            this.indeks = "E";
        }
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
        return indeks;
    };

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
        return nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
        this.nilai = nilai;
        if (nilai == 4.0){
            this.indeks = "A";
        } else if ((nilai >= 3.0) && (nilai < 4.0)){
            this.indeks = "B";
        } else if ((nilai >= 2.0) && (nilai < 3.0)){
            this.indeks = "C";
        } else if ((nilai >= 1.0) && (nilai < 2.0)){
            this.indeks = "D";
        } else if ((nilai >= 0.0) && (nilai < 1.0)){
            this.indeks = "E";
        } else {
            this.nilai = 0.0;
            this.indeks = "E";
        }
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
        if (nilai == 4.0){
            this.indeks = "A";
        } else if ((nilai >= 3.0) && (nilai < 4.0)){
            this.indeks = "B";
        } else if ((nilai >= 2.0) && (nilai < 3.0)){
            this.indeks = "C";
        } else if ((nilai >= 1.0) && (nilai < 2.0)){
            this.indeks = "D";
        } else {
            this.indeks = "E";
        }
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Contoh: nilai = 2.0, countLulus = 25, kapasitas = 100
     * normalisasi nilai = 2.0 + (2.0 * (25/100)) = 2.5
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
        double persentase = ((double) countLulus / (double) this.mataKuliah.getKapasitas());
        this.nilai += this.nilai * persentase;
        if (this.nilai > 4.0){
            this.nilai = 4.0;
        }
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
        double kont = this.mataKuliah.getSks() * this.nilai / sks;
        return kont;
    }
}
