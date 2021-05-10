package bidang;

public class Persegi implements HitungBidang {

    private double panjang, lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return getPanjang()*getLebar();
    }

    @Override
    public double hitungKeliling() {
        return 2*getPanjang()+2*getLebar();
    }
}
