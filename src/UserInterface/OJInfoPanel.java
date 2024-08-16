package UserInterface;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class OJInfoPanel extends JPanel {

    public OJInfoPanel() {
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(220, 220, 220)); 
        setPreferredSize(new Dimension(600, 150)); 

        // Crear el panel de fondo grande
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setLayout(new GridLayout(2, 2, 10, 10)); 
        backgroundPanel.setBackground(new Color(240, 240, 240)); /
        backgroundPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 

        // Crear y añadir el campo de nombre
        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setFont(new Font("Verdana", Font.BOLD, 18)); 
        nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField nameField = new JTextField("Justin Ortiz");
        nameField.setEditable(false);
        nameField.setBackground(Color.WHITE);
        nameField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        nameField.setFont(new Font("Verdana", Font.PLAIN, 14)); 
        nameField.setPreferredSize(new Dimension(150, 25)); 
        nameField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
        nameField.setOpaque(true);

        // Crear y añadir el campo de cédula
        JLabel idLabel = new JLabel("Cédula:");
        idLabel.setFont(new Font("Verdana", Font.BOLD, 18)); 
        idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField idField = new JTextField("1234567890");
        idField.setEditable(false);
        idField.setBackground(Color.WHITE);
        idField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        idField.setFont(new Font("Verdana", Font.PLAIN, 14)); /
        idField.setPreferredSize(new Dimension(150, 25)); 
        idField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); /
        idField.setOpaque(true);

        backgroundPanel.add(nameLabel);
        backgroundPanel.add(nameField);
        backgroundPanel.add(idLabel);
        backgroundPanel.add(idField);

        add(backgroundPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OJInfoPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.add(new OJInfoPanel());
        frame.setVisible(true);
    }
}