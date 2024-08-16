package UserInterface;

import javax.swing.*;
import java.awt.*;

public class OJExperimentationPanel extends JPanel {

    public OJExperimentationPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(240, 240, 240)); 

        // Crear el panel para el título y el botón
        JPanel titleAndButtonPanel = new JPanel();
        titleAndButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        titleAndButtonPanel.setBackground(new Color(240, 240, 240)); 

        // Título
        JLabel titleLabel = new JLabel("Hormiguero virtual");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(50, 100, 200)); 

        JButton createAntButton = new JButton("Crear hormiga larva");
        createAntButton.setFont(new Font("Arial", Font.PLAIN, 14));
        createAntButton.setBackground(new Color(200, 200, 200)); 
        createAntButton.setForeground(Color.BLACK);
        createAntButton.setOpaque(true);
        createAntButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        createAntButton.setFocusPainted(false);

        titleAndButtonPanel.add(titleLabel);
        titleAndButtonPanel.add(createAntButton);

        JPanel antsInfoPanel = new JPanel();
        antsInfoPanel.setLayout(new GridLayout(4, 3, 5, 5)); 
        antsInfoPanel.setBackground(new Color(240, 240, 240)); 

        for (int i = 0; i < 12; i++) {
            JLabel placeholder = new JLabel("");
            placeholder.setOpaque(true);
            placeholder.setBackground(Color.LIGHT_GRAY);
            placeholder.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            antsInfoPanel.add(placeholder);
        }

        add(titleAndButtonPanel, BorderLayout.NORTH);
        add(antsInfoPanel, BorderLayout.CENTER);
    }
}