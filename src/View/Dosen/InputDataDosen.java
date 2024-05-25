package View.Dosen;

import Controller.ControllerDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputDataDosen extends JFrame {
    ControllerDosen controller;
    
    JLabel header = new JLabel("Input Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNo_hp = new JLabel("No_hp");
    JLabel labelInputEmail = new JLabel("Email");
    JTextField inputNama = new JTextField();
    JTextField inputNo_hp = new JTextField();
    JTextField inputEmail = new JTextField();
    JButton tombolTambah = new JButton("Tambah Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public InputDataDosen() {
        setTitle("Input Dosen");
        setVisible(true);
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        add(header);
        add(labelInputNama);
        add(labelInputNo_hp);
        add(labelInputEmail);
        add(inputNama);
        add(inputNo_hp);
        add(inputEmail);
        add(tombolTambah);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNo_hp.setBounds(20, 96, 440, 24);
        inputNo_hp.setBounds(18, 120, 440, 36);
        labelInputEmail.setBounds(20, 150, 440, 24);
        inputEmail.setBounds(18, 190, 440, 36);
        tombolKembali.setBounds(20, 230, 215, 40);
        tombolTambah.setBounds(240, 230, 215, 40);
        
        controller = new ControllerDosen(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertDosen();
            }
        });
    }
    public String getInputNama() {
        return inputNama.getText();
    }
    public String getInputNo_hp() {
        return inputNo_hp.getText();
    }
    public String getInputEmail() {
        return inputEmail.getText();
    }
}
