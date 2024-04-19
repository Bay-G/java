import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class R {

    private static JFormattedTextField textField1; // Bakiye girişi için JFormattedTextField

    public static void main(String[] args) {
        JFrame frame = new JFrame("R");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int frameWidth = 300;
        int frameHeight = 200;
        frame.setSize(frameWidth, frameHeight);

        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;
        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Yüzde Hesaplama");
        JButton button2 = new JButton("R Hesaplama");

        button1.setBounds(50, 50, 200, 30);
        button2.setBounds(50, 90, 200, 30);

        Font buttonFont = new Font("Arial", Font.PLAIN, 12);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();

                // Bakiye girişi için JFormattedTextField kullanılacak
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
                decimalFormat.setMaximumFractionDigits(2);
                textField1 = new JFormattedTextField(decimalFormat);

                JLabel label1 = new JLabel("Bakiye");
                JLabel label2 = new JLabel("Yüzdesel Artış");

                label1.setBounds(10, 50, 80, 20);
                label2.setBounds(10, 80, 120, 20);
                textField1.setBounds(100, 50, 150, 20);

                JFormattedTextField textField2 = new JFormattedTextField(decimalFormat);
                textField2.setBounds(120, 80, 150, 20);

                JButton calculateButton = new JButton("Hesapla");
                calculateButton.setBounds(10, 110, 80, 20);

                JButton backButton = new JButton("Geri");
                backButton.setBounds(10, 10, 80, 30);

                calculateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            double bakiye = ((Number) textField1.getValue()).doubleValue();
                            double yuzdeselArtis = ((Number) textField2.getValue()).doubleValue();
                            double yeniBakiye = bakiye * (1 + yuzdeselArtis / 100);
                
                            DecimalFormat df = new DecimalFormat("#,##0.0");
                            String formattedResult = df.format(yeniBakiye);
                
                            // Girilen bakiyeyi güncelle
                            textField1.setText(formattedResult);
                            
                            // calculateButton'ı pasif hale getir
                            calculateButton.setEnabled(false);
                            backButton.setEnabled(false);

                            // Yeniden hesapla tuşunu aktive et
                            calculateButton.setEnabled(true);
                            backButton.setEnabled(true);
                              
                            
                
                        } catch (NumberFormatException ex) {
                            System.out.println("Geçersiz sayı");
                        }
                
                        frame.revalidate();
                    }
                });
                
              
                

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().removeAll();
                        frame.repaint();

                        frame.getContentPane().add(button1);
                        frame.getContentPane().add(button2);

                        frame.revalidate();
                    }
                });

                frame.add(label1);
                frame.add(textField1);
                frame.add(label2);
                frame.add(textField2);
                frame.add(calculateButton);
                frame.add(backButton);

                frame.revalidate();
            }
        });

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
