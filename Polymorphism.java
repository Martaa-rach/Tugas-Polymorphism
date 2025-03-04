package pbo;

interface HitungBangunDatar {
    double hitungLuas();
    double hitungKeliling();
}

abstract class BangunDatar implements HitungBangunDatar {
    abstract boolean apakahKecil();
}

class Persegi extends BangunDatar {
    double SisiPersegi;

    Persegi(double SisiPersegi) {
        this.SisiPersegi = SisiPersegi;
    }

    @Override
    public double hitungLuas() {
        return SisiPersegi * SisiPersegi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * SisiPersegi;
    }

    @Override
    boolean apakahKecil() {
        return SisiPersegi < 5;
    }

    void tampilkanInfo() {
        System.out.printf("Persegi dengan sisi %.2f memiliki luas %.2f dan keliling %.2f\n", 
                           SisiPersegi, hitungLuas(), hitungKeliling());
        System.out.println("Kategori: " + (apakahKecil() ? "Kecil" : "Besar"));
    }
}

class Lingkaran extends BangunDatar {
    double JariJariLingkaran;

    Lingkaran(double JariJariLingkaran) {
        this.JariJariLingkaran = JariJariLingkaran;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * JariJariLingkaran * JariJariLingkaran;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * JariJariLingkaran;
    }

    @Override
    boolean apakahKecil() {
        return JariJariLingkaran < 5;
    }

    void tampilkanInfo() {
        System.out.printf("Lingkaran dengan jari-jari %.2f memiliki luas %.2f dan keliling %.2f\n", 
                           JariJariLingkaran, hitungLuas(), hitungKeliling());
        System.out.println("Kategori: " + (apakahKecil() ? "Kecil" : "Besar"));
    }
}

class Segitiga extends BangunDatar {
    double AlasSegitiga, TinggiSegitiga, SisiSegitiga1, SisiSegitiga2, SisiSegitiga;

    Segitiga(double AlasSegitiga, double TinggiSegitiga, double SisiSegitiga1, double SisiSegitiga2, double SisiSegitiga) {
        this.AlasSegitiga = AlasSegitiga;
        this.TinggiSegitiga = TinggiSegitiga;
        this.SisiSegitiga1 = SisiSegitiga1;
        this.SisiSegitiga2 = SisiSegitiga2;
        this.SisiSegitiga = SisiSegitiga;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * AlasSegitiga * TinggiSegitiga;
    }

    @Override
    public double hitungKeliling() {
        return SisiSegitiga1 + SisiSegitiga2 + SisiSegitiga;
    }

    @Override
    boolean apakahKecil() {
        return hitungLuas() < 10;
    }

    void tampilkanInfo() {
        System.out.printf("Segitiga dengan alas %.2f dan tinggi %.2f memiliki luas %.2f dan keliling %.2f\n", 
                           AlasSegitiga, TinggiSegitiga, hitungLuas(), hitungKeliling());
        System.out.println("Kategori: " + (apakahKecil() ? "Kecil" : "Besar"));
    }
}

public class Polymorphism {
     public static void main(String[] args) {
      
        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);
        Segitiga s = new Segitiga(3, 4, 5, 4, 3);
      
        System.out.println("===== INFORMASI BANGUN DATAR =====");
        p.tampilkanInfo();
        System.out.println("----------------------------------");
        l.tampilkanInfo();
        System.out.println("----------------------------------");
        s.tampilkanInfo();
        System.out.println("==================================");
    }
}
