package UserInterface;

import javax.swing.*;
import java.awt.*;

public class OJActionButtonsPanel extends JPanel {

    public OJActionButtonsPanel() {
        setLayout(new GridLayout(1, 2, 5, 5));
        setBackground(new Color(240, 240, 240));

        JButton eliminarButton = new JButton("Eliminar");
        JButton guardarButton = new JButton("Guardar");

        eliminarButton.setFont(new Font("Arial", Font.PLAIN, 14));
        guardarButton.setFont(new Font("Arial", Font.PLAIN, 14));

        eliminarButton.setBackground(Color.LIGHT_GRAY);
        guardarButton.setBackground(Color.LIGHT_GRAY);

        add(eliminarButton);
        add(guardarButton);
    }
}