import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class akubuatswing{
    public static void main(String[] args){
        JFrame frame = new JFrame("Aku Ulang Tahun");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelInput = new JPanel();
        panelInput.setLayout(new BoxLayout(panelInput, BoxLayout.X_AXIS));

        JPanel panelHasil = new JPanel();
        panelHasil.setLayout(new OverlayLayout(panelHasil));

        JLabel labelNama = new JLabel("Masukkan Nama:");
        JTextField fieldNama = new JTextField(15);
        fieldNama.setMaximumSize(new JTextArea(3, 15).getPreferredSize());
        JButton tombolSapa = new JButton("Klik Aku");
        JLabel labelHasil = new JLabel("Tulis nama dulu.");
        labelHasil.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        panelInput.add(labelNama);
        panelInput.add(fieldNama);
        panelInput.add(tombolSapa);
        panelHasil.add(labelHasil);

        tombolSapa.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                if (tombolSapa.getModel().isPressed()){
                    String nama = fieldNama.getText();
                    if (!nama.trim().isEmpty()){
                        labelHasil.setText("Selamat ulang tahun, " + nama + ".");
                    }else{
                        labelHasil.setText("Namanya masih kosong mas.");
                    }
                }
            }
        });

        frame.add(panelInput);
        frame.add(panelHasil);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}