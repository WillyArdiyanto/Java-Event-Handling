package ruang;

import bidang.*;
import ruang.HitungBangunRuang;

public class Balok extends Persegi implements HitungBangunRuang, HitungBidang {
    private double tinggi;

    public void setTinggi(float tinggi) {this.tinggi = tinggi;}
    
    public double getTinggi() {return tinggi;}

    @Override
    public double hitungVolumeBalok() {
        return super.hitungLuas()*getTinggi();
    }

    @Override
    public double hitungLuasPermukaanBalok() {
        return (((super.hitungKeliling())*getTinggi())+2*super.hitungLuas());
    }
    
    
}
