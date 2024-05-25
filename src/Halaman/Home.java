package Halaman;

import View.Mahasiswa.ViewDataMahasiswa;
import View.Dosen.ViewDataDosen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame {
    
    JLabel tulisan1 = new JLabel("Selamat Datang!!!");
    JLabel tulisan2 = new JLabel("Silahkan Klik untuk melanjutkan");
    
    JLabel tulisan3 = new JLabel("Nama  : Rifqi Arief Nur Rasyid");
    JLabel tulisan4 = new JLabel("NIM    : 123220162");
    JLabel tulisan5 = new JLabel("Kelas  : IF-F");
    JLabel tulisan6 = new JLabel("Matkul  : Praktikum Pemrograman Java");
       
    JButton viewmahasiswa = new JButton("View Data Mahasiswa");
    JButton viewdosen = new JButton("View Data Dosen");
    
    
    public Home(){
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(tulisan1);
        tulisan1.setBounds(20, 20, 200, 24);
        tulisan1.setFont(new Font("Arial", Font.PLAIN, 20));
        add(tulisan2);
        tulisan2.setBounds(20, 50, 300, 25);
        tulisan2.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(tulisan3);
        tulisan3.setBounds(20, 80, 300, 25);
        tulisan3.setFont(new Font("Arial", Font.PLAIN, 18));
        add(tulisan4);
        tulisan4.setBounds(20, 110, 300, 25);
        tulisan4.setFont(new Font("Arial", Font.PLAIN, 18));
        add(tulisan5);
        tulisan5.setBounds(20,140, 300, 25);
        tulisan5.setFont(new Font("Arial", Font.PLAIN, 18));
        add(tulisan6);
        tulisan6.setBounds(20,170, 350, 25);
        tulisan6.setFont(new Font("Arial", Font.PLAIN, 18));
        
        add(viewmahasiswa);
        viewmahasiswa.setBounds(130, 200, 200, 32);
        
        add(viewdosen);
        viewdosen.setBounds(130, 250, 200, 32);
        
        
        viewmahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMahasiswa();
            }
        });
        
        viewdosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
                
            }
        });
    }
}
