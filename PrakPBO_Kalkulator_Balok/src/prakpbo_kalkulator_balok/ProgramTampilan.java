/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_kalkulator_balok;

/**
 *
 * @author ASUS
 */
import java.awt.event.*;
import javax.swing.*;


public class ProgramTampilan extends JFrame implements ActionListener {

    JLabel judul = new JLabel("KALKULATOR BALOK");
    JLabel panjang = new JLabel("Masukkan Panjang");
    JTextField tfpanjang = new JTextField();
    JLabel lebar = new JLabel("Masukkan Lebar");
    JTextField tflebar = new JTextField();
    JLabel tinggi = new JLabel("Masukkan Tinggi");
    JTextField tftinggi = new JTextField();
    
    JLabel hasil = new JLabel("Hasil:");
    JLabel luas = new JLabel();
    JLabel keliling = new JLabel();
    JLabel LP = new JLabel();
    JLabel volume = new JLabel();
    JButton btnhitung = new JButton("Hitung");
    JButton btnreset = new JButton("Reset");

    public ProgramTampilan() {
        
        setTitle("Kalkulator Balok");
        setSize(700, 650);
        setLayout(null);
        add(judul);
        
        add(lebar);
        add(tflebar);
        
        add(panjang);
        add(tfpanjang);
        
        add(tinggi);
        add(tftinggi);
        
        add(hasil);
        
        add(luas);     
        add(keliling);
        add(LP);
        add(volume);
        
        add(btnhitung);
        add(btnreset);

        judul.setBounds(250,20,200,25);
        panjang.setBounds(35,67,150,25);   
        tfpanjang.setBounds(180,70,270,25);
        
        lebar.setBounds(35,118,150,25);
        tflebar.setBounds(180,120,270,25);

        tinggi.setBounds(35,167,150,25);
        tftinggi.setBounds(180,170,270,25);

        hasil.setBounds(298,210,200,25);

        luas.setBounds(40,240,300,25);
        keliling.setBounds(40,280,300,25);
        volume.setBounds(40,320,300,25);
        LP.setBounds(40,360,300,25);

        btnhitung.setBounds(150,450,100,50);
        btnreset.setBounds(350,450,100,50);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnhitung.addActionListener(this);
        btnreset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    double panjang, lebar, tinggi;
    if (e.getSource() == btnhitung) {
            if (tfpanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Panjang !!");
            }
            else if (tflebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Lebar !!");
            }
            else if (tftinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap Masukkan Tinggi !!");
            }
            else {
                try {
                    panjang = Double.parseDouble(tfpanjang.getText());
                    lebar = Double.parseDouble(tflebar.getText());
                    tinggi = Double.parseDouble(tftinggi.getText());

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    luas.setText("Luas Persegi Panjang             = " + balok.luas());
                    keliling.setText("Keliling Persegi Panjang        = " + balok.keliling());
                    LP.setText("Luas Permukaan Balok           = " + balok.LP());
                    volume.setText("Volume Balok                           = " + balok.volume());
                }
                catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Harap Masukkan angka !!");
                }
            }
        }

        if (e.getSource() == btnreset) {
            luas.setText("");
            keliling.setText("");
            LP.setText("");
            volume.setText("");
            tfpanjang.setText("");
            tflebar.setText("");
            tftinggi.setText("");
        }
    
    }
    
}