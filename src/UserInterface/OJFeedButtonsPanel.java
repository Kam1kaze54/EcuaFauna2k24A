package UserInterface;

import javax.swing.*;
import java.awt.*;

public class OJFeedButtonsPanel extends JPanel {

    public OJFeedButtonsPanel() {
        setLayout(new GridLayout(2, 2, 5, 5));
        setBackground(new Color(240, 240, 240)); // Fondo gris claro

        JComboBox<String> genoAlimentoBox = new JComboBox<>(new String[]{"<GenoAlimento>"});
        JButton alimentarGenoButton = new JButton("Alimentar con Genoalimento");

        JComboBox<String> ingestaNativaBox = new JComboBox<>(new String[]{"<IngestaNativa>"});
        JButton alimentarIngestaButton = new JButton("Alimentar con Ingesta Nativa");

        alimentarGenoButton.setFont(new Font("Arial", Font.PLAIN, 14));
        alimentarIngestaButton.setFont(new Font("Arial", Font.PLAIN, 14));
        alimentarGenoButton.setBackground(Color.DARK_GRAY);
        alimentarIngestaButton.setBackground(Color.DARK_GRAY);
        alimentarGenoButton.setForeground(Color.WHITE);
        alimentarIngestaButton.setForeground(Color.WHITE);

        add(genoAlimentoBox);
        add(alimentarGenoButton);
        add(ingestaNativaBox);
        add(alimentarIngestaButton);
    }
}