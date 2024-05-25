package View.Mahasiswa;

import Controller.ControllerMahasiswa;
import Model.Mahasiswa.ModelMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EditDataMahasiswa extends JFrame {
    ControllerMahasiswa controller;
    
    JLabel header = new JLabel("Edit Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNo_hp = new JLabel("No_hp");
    JLabel labelinputNim = new JLabel("Email");
    JTextField inputNama = new JTextField();
    JTextField inputAngkatan = new JTextField();
    JTextField inputNim = new JTextField();
    JButton tombolEdit = new JButton("Edit Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public EditDataMahasiswa(ModelMahasiswa mahasiswa) {
        setTitle("Edit Mahasiswa");
        setVisible(true);
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        add(header);
        add(labelInputNama);
        add(labelInputNo_hp);
        add(labelinputNim);
        add(inputNama);
        add(inputAngkatan);
        add(inputNim);
        add(tombolEdit);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNo_hp.setBounds(20, 96, 440, 24);
        inputAngkatan.setBounds(18, 120, 440, 36);
        labelinputNim.setBounds(20, 150, 440, 24);
        inputNim.setBounds(18, 190, 440, 36);
        tombolKembali.setBounds(20, 230, 215, 40);
        tombolEdit.setBounds(240, 230, 215, 40);
        
        inputNama.setText(mahasiswa.getNama());
        inputNim.setText(mahasiswa.getNim());
        inputAngkatan.setText(mahasiswa.getAngkatan());
        
        controller = new ControllerMahasiswa(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMahasiswa();
            }
        });

        tombolEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editMahasiswa(mahasiswa.getId());
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
