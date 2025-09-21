package model;

public class Member extends Orang {
    private int id;
    private int masaAktifBulan;

    public Member(int id, String name, int masaAktifBulan) {
        super(name);
        this.id = id;
        this.masaAktifBulan = masaAktifBulan;
    }

    public int getId() { return id; }
    public int getMasaAktifBulan() { return masaAktifBulan; }

    public void setMasaAktifBulan(int bulan) { this.masaAktifBulan = bulan; }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', masaAktif=" + masaAktifBulan + " bulan}";
    }
}
