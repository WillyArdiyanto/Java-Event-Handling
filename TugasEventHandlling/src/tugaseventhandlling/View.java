package tugaseventhandlling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ruang.Balok;

public class View extends JFrame implements ActionListener {

    final JTextField fpanjang = new JTextField();
    final JTextField flebar = new JTextField();
    final JTextField ftinggi = new JTextField();

    JLabel lpanjang = new JLabel("Panjang : ");
    JLabel llebar = new JLabel("Lebar : ");
    JLabel ltinggi = new JLabel("Tinggi : ");
    JLabel lhasil = new JLabel("Hasil:");
    JLabel lLuasPersegi = new JLabel("");
    JLabel lKeliling = new JLabel("");
    JLabel lLuasPermukaan = new JLabel("");
    JLabel lVolume = new JLabel("");
    JLabel lJudul = new JLabel("Kalkulator Balok");

    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");

    public View() {
        setTitle("Kalkulator Balok");
        setDefaultCloseOperation(3);
        setSize(350, 300);

        ButtonGroup group = new ButtonGroup();

        setLayout(null);
        add(fpanjang);
        add(flebar);
        add(ftinggi);
        add(lpanjang);
        add(llebar);
        add(ltinggi);
        add(lhasil);
        add(lLuasPersegi);
        add(lKeliling);
        add(lLuasPermukaan);
        add(lVolume);
        add(btnHitung);
        add(btnReset);
        add(lJudul);

        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen
//        lnama.setBounds(10, 10, 120, 20);
        lJudul.setBounds(120, 10, 120, 20);
        lpanjang.setBounds(10, 40, 100, 20);
        fpanjang.setBounds(130, 40, 100, 20);
        llebar.setBounds(10, 60, 100, 20);
        flebar.setBounds(130, 60, 100, 20);
        ltinggi.setBounds(10, 80, 100, 20);
        ftinggi.setBounds(130, 80, 100, 20);
        lhasil.setBounds(120, 100, 100, 20);
        lLuasPersegi.setBounds(10, 130, 200, 20);
        lKeliling.setBounds(10, 150, 200, 20);
        lLuasPermukaan.setBounds(10, 170, 200, 20);
        lVolume.setBounds(10, 190, 200, 20);
        btnHitung.setBounds(95, 220, 80, 20);
        btnReset.setBounds(180, 220, 80, 20);

        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);

        setVisible(true);
    }
        
        public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHitung){
            try {
                Balok b = new Balok();

                b.setPanjang(Float.parseFloat(fpanjang.getText()));
                b.setLebar(Float.parseFloat(flebar.getText()));
                b.setTinggi(Float.parseFloat(ftinggi.getText()));

                lLuasPersegi.setText(  "Luas Persegi         : " + b.hitungLuas());
                lKeliling.setText(     "Keliling Persegi     : " + b.hitungKeliling());
                lVolume.setText(       "Volume Balok         : " + b.hitungVolumeBalok());
                lLuasPermukaan.setText("Luas Permukaan Balok : " + b.hitungLuasPermukaanBalok());
            }catch(NumberFormatException error) {
                JOptionPane.showMessageDialog(this, error.getMessage());
            }
        }

        if(e.getSource() == btnReset){
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            lLuasPersegi.setText("");
            lKeliling.setText("");
            lLuasPermukaan.setText("");
            lVolume.setText("");
        }
    }
    
}
