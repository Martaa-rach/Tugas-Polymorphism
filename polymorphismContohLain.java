package pbo;

abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void bersuara();
    abstract void bermain();
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berkata: Meow~ Meow~");
    }

    @Override
    void bermain() {
        System.out.println(nama + " sedang bermain dengan gulungan benang!");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berkata: Woof! Woof!");
    }

    @Override
    void bermain() {
        System.out.println(nama + " sedang mengejar bola!");
    }
}

class Burung extends Hewan {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berkata: Cuit~ Cuit~");
    }

    @Override
    void bermain() {
        System.out.println(nama + " sedang terbang mengitari ruangan!");
    }
}

public class polymorphismContohLain {
    public static void main(String[] args) {
        
        Hewan[] peliharaan = {
            new Kucing("Kitty"),
            new Anjing("Hely"),
            new Burung("Tweety")
        };

        System.out.println("===== Hewan Peliharaan Virtual =====\n");
        for (Hewan h : peliharaan) {
            h.bersuara();
            h.bermain();
            System.out.println("-----------------------------------");
        }
    }
}