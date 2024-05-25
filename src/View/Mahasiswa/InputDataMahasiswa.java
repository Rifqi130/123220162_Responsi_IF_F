package View.Mahasiswa;

import Controller.ControllerMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputDataMahasiswa extends JFrame {
    ControllerMahasiswa controller;
    
    JLabel header = new JLabel("Input Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNim = new JLabel("Nim");
    JLabel labelInputAngkatan = new JLabel("Angkatan");
    JTextField inputNama = new JTextField();
    JTextField inputNim = new JTextField();
    JTextField inputAngkatan = new JTextField();
    JButton tombolTambah = new JButton("Tambah Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public InputDataMahasiswa() {
        setTitle("Input Mahasiswa");
        setVisible(true);
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        add(header);
        add(labelInputNama);
        add(labelInputNim);
        add(labelInputAngkatan);
        add(inputNama);
        add(inputNim);
        add(inputAngkatan);
        add(tombolTambah);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNim.setBounds(20, 96, 440, 24);
        inputNim.setBounds(18, 120, 440, 36);
        labelInputAngkatan.setBounds(20, 150, 440, 24);
        inputAngkatan.setBounds(18, 190, 440, 36);
        tombolKembali.setBounds(20, 230, 215, 40);
        tombolTambah.setBounds(240, 230, 215, 40);
        
        controller = new ControllerMahasiswa(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMahasiswa();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertMahasiswa();
            }
        });
    }
    
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputNim() {
        return inputNim.getText();
    }
    
    public String getInputAngkatan() {
        return inputAngkatan.getText();
    }
}

